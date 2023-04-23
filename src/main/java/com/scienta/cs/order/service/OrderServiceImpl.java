package com.scienta.cs.order.service;

import com.scienta.cs.core.exceptions.ServiceValidationException;
import com.scienta.cs.easypost.rate.models.RateDto;
import com.scienta.cs.easypost.shipment.models.ShipmentBuyRequest;
import com.scienta.cs.easypost.shipment.models.ShipmentDto;
import com.scienta.cs.easypost.shipment.service.EPShipmentService;
import com.scienta.cs.notification.core.models.enums.NotificationType;
import com.scienta.cs.notification.queue.models.messages.NotificationWrapperMessage;
import com.scienta.cs.notification.queue.services.NotificationConsumerService;
import com.scienta.cs.nowpayments.models.request.NPReplenishmentInvoiceCreateRequest;
import com.scienta.cs.nowpayments.models.response.NPReplenishmentInvoiceCreateResponse;
import com.scienta.cs.nowpayments.replenishment.models.NPUpadateInvoiceRequest;
import com.scienta.cs.nowpayments.replenishment.services.ReplenishmentService;
import com.scienta.cs.order.model.entity.Order;
import com.scienta.cs.order.model.entity.OrdersChoosenRate;
import com.scienta.cs.order.repository.OrderRateRepository;
import com.scienta.cs.order.repository.OrderRepository;
import com.scienta.cs.postagelabel.service.PostageLabelService;
import com.scienta.cs.rate.converter.RateResponseConverter;
import com.scienta.cs.rate.model.entity.Rate;
import com.scienta.cs.rate.repository.RateRepository;
import com.scienta.cs.shipment.repository.Shipment;
import com.scienta.cs.shipment.repository.ShipmentRepository;
import com.scienta.cs.shipment.services.ShipmentService;
import com.scienta.cs.types.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderServiceImpl implements OrderService {

    private final ShipmentRepository shipmentRepository;
    private final ShipmentService shipmentService;
    private final RateRepository rateRepository;
    private final OrderRepository orderRepository;
    private final OrderRateRepository orderRateRepository;
    private final RateResponseConverter rateResponseConverter;
    private final ReplenishmentService replenishmentService;
    private final OrderNotificationService orderNotificationService;

    @Override()
    public OrderResponse initOrder(OrderRequest request) {

        Order order = orderRepository.save(new Order());

        request.getOrderList().forEach(
                orderRequestInfo -> {
                    Rate rate = rateRepository.findById(orderRequestInfo.getRateId())
                            .orElseThrow(() -> new ServiceValidationException("Rate not found"));

                    Shipment shipment = shipmentRepository.findById(orderRequestInfo.getShipmentId())
                            .orElseThrow(() -> new ServiceValidationException("Shipment not found"));

                    if (!shipment.getId().equals(rate.getShipmentId())) {
                        throw new ServiceValidationException("Shipment not found");
                    }

                    orderRateRepository.save(OrdersChoosenRate.builder()
                            .order(order)
                            .rate(rate)
                            .build());
                }
        );

        return OrderResponse.newBuilder().id(order.getUuid()).build();
    }

    @Override
    public OrderCompleteResponse completeOrderProcessing(OrderCompleteRequest request) {

        Order order = orderRepository.findById(request.getOrderId())
                .orElseThrow(() -> new ServiceValidationException("Order with id = %s not exist".formatted(request.getOrderId())));

        if (Strings.isNotEmpty(order.getInvoiceUrl())) {
            return OrderCompleteResponse.newBuilder().invoice_url(order.getInvoiceUrl()).build();
        }

        NPReplenishmentInvoiceCreateResponse response = replenishmentService.createInvoice(NPReplenishmentInvoiceCreateRequest.builder()
                .orderId(request.getOrderId())
                .orderDescription("ORDER: %s".formatted(order.getUuid()))
                .priceAmount(getOrderAmount(request.getOrderId()))
                .priceCurrency(getOrderCurrency(request.getOrderId()))
                .successUrl("https://cryptopost.global/order/status/%s".formatted(request.getOrderId()))
                .build());
        log.info("NEW INVOICE {}",response);
        order.setInvoiceId(response.getId().toString());
        order.setInvoiceUrl(response.getInvoiceUrl());
        orderRepository.save(order);
        return OrderCompleteResponse.newBuilder().invoice_url(response.getInvoiceUrl()).build();
    }

    @Override
    public void finishOrder(Order order) {
        List<OrdersChoosenRate> rateList = orderRateRepository.findAllByOrderId(order.getUuid());

        for (OrdersChoosenRate ordersChoosenRate : rateList) {
            try {
                log.info("CHOOSEN RATE TO PURCHASE {}", ordersChoosenRate);
                shipmentService.buy(ShipmentBuyRequest
                        .builder()
                        .rate(RateDto.builder().id(ordersChoosenRate.getRate().getId()).build())
                        .shipmentId(ordersChoosenRate.getRate().getShipmentId())
                        .build());
                ordersChoosenRate.setStatus(OrderChoosenRateStatus.FINISHED);
            } catch (Exception e) {
                log.error("Some error has occured during the purchase of shipment msg={}", e.getMessage(), e);
                ordersChoosenRate.setStatus(OrderChoosenRateStatus.ERROR);
                ordersChoosenRate.setErrorMsg(e.getMessage());
            }
            orderRateRepository.save(ordersChoosenRate);
        }

        orderNotificationService.sendLabels(order.getUuid());
    }

    @Override
    public OrderGetResponse getOrder(OrderGetRequest request) {
        Order order = orderRepository.findById(request.getOrderId())
                .orElseThrow(() -> new ServiceValidationException("Order not exist"));

        List<RateResponse> rateList = orderRateRepository.findAllByOrderId(request.getOrderId()).stream()
                .map(ocr -> rateResponseConverter.convertFromEntity(ocr.getRate(), ocr.getStatus()))
                .toList();


        return OrderGetResponse.newBuilder()
                .rateList(rateList)
                .status(order.getStatus())
                .transactionId(order.getInvoiceId())
                .orderId(order.getUuid())
                .build();
    }

    @Override
    public Boolean isFullPaid(NPUpadateInvoiceRequest request) {
        BigDecimal actualPaidAmount = new BigDecimal(request.getActuallyPaid());
        BigDecimal payAmount = new BigDecimal(request.getPayAmount());

        if(actualPaidAmount.compareTo(payAmount) < 0) {
            orderNotificationService.sendInsufficientFunds(request.getOrderId(), payAmount.subtract(actualPaidAmount), request.getPayCurrency());
            return false;
        }

        return true;
    }

    private String getOrderCurrency(String orderId) {
        List<Rate> rateList = orderRateRepository.findAllByOrderId(orderId).stream().map(OrdersChoosenRate::getRate).toList();

        if (CollectionUtils.isEmpty(rateList)) {
            throw new ServiceValidationException("Rate list is empty for order=[%s]".formatted(orderId));
        }

        return rateList.stream().findAny().map(Rate::getCurrency).orElse("USD");
    }

    private BigDecimal getOrderAmount(String orderId) {
        List<Rate> rateList = orderRateRepository.findAllByOrderId(orderId).stream().map(OrdersChoosenRate::getRate).toList();

        if (CollectionUtils.isEmpty(rateList)) {
            throw new ServiceValidationException("Rate list is empty for order=[%s]".formatted(orderId));
        }

        BigDecimal amount = BigDecimal.ZERO;
        for (Rate rate : rateList) {
            amount = amount.add(BigDecimal.valueOf(rate.getRate()).setScale(2, RoundingMode.HALF_UP));
        }

        return amount;
    }
}
