package com.scienta.cs.callback;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.scienta.cs.core.exceptions.ServiceValidationException;
import com.scienta.cs.nowpayments.models.TransactionStatus;
import com.scienta.cs.nowpayments.replenishment.models.NPUpadateInvoiceRequest;
import com.scienta.cs.nowpayments.replenishment.services.ReplenishCallbackHandler;
import com.scienta.cs.nowpayments.validator.CallbackRequestValidatorService;
import com.scienta.cs.order.model.entity.Order;
import com.scienta.cs.order.repository.OrderRepository;
import com.scienta.cs.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.TreeMap;

@Component
@RequiredArgsConstructor
@Slf4j
public class ReplenishCallbackHandlerImpl implements ReplenishCallbackHandler {

    private final OrderService orderService;
    private final OrderRepository orderRepository;
    private final CallbackRequestValidatorService requestValidatorService;
    private final ObjectMapper objectMapper;

    @Override
    public void callback(TreeMap<String, Object> request, String signature) {
        log.info("callback for replenishment request = {}",request);
        requestValidatorService.validateRequest(request,signature);
        NPUpadateInvoiceRequest mapped = objectMapper.convertValue(request, NPUpadateInvoiceRequest.class);
        handle(mapped);
    }

    @Override
    public void handle(NPUpadateInvoiceRequest request) {
        Order order = orderRepository.findById(request.getOrderId()).orElseThrow(
                ()->new ServiceValidationException("Order with id=%s not found".formatted(request.getOrderId())));
        if(order.getStatus() != null && order.getStatus().equalsIgnoreCase(TransactionStatus.FINISHED.name())) {
            return;
        }

        order.setStatus(request.getPaymentStatus());
        order.setPaymentId(request.getPaymentId());
        orderRepository.save(order);

        if(request.getPaymentStatus().equalsIgnoreCase(TransactionStatus.CONFIRMED.name())) {
            if(orderService.isFullPaid(request)) {
                orderService.finishOrder(order);
            }
        }
    }

}
