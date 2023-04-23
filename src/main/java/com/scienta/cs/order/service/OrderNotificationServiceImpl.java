package com.scienta.cs.order.service;

import com.scienta.cs.core.exceptions.ServiceValidationException;
import com.scienta.cs.notification.core.models.enums.NotificationType;
import com.scienta.cs.notification.queue.models.messages.NotificationWrapperMessage;
import com.scienta.cs.notification.queue.services.NotificationConsumerService;
import com.scienta.cs.order.model.entity.Order;
import com.scienta.cs.order.repository.OrderRateRepository;
import com.scienta.cs.order.repository.OrderRepository;
import com.scienta.cs.postagelabel.service.PostageLabelService;
import com.scienta.cs.types.OrderCompleteRequest;
import com.scienta.cs.types.OrderCompleteResponse;
import com.scienta.cs.types.OrderEmailRequest;
import com.scienta.cs.types.PostageLabelResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderNotificationServiceImpl implements OrderNotificationService {

    private final PostageLabelService postageLabelService;
    private final OrderRateRepository orderRateRepository;
    private final OrderRepository orderRepository;
    private final NotificationConsumerService notificationConsumerService;

    @Override
    @Async
    public void sendLabels(String orderId) {
        String toNotifyEmail = orderRepository.findById(orderId)
                .map(Order::getToNotifyMailAddress)
                .filter(Strings::isNotEmpty)
                .orElseThrow(() -> new ServiceValidationException("Order not found or to notify email is null"));

        List<String> urls = orderRateRepository.findAllByOrderId(orderId)
                .stream()
                .filter(ordersChoosenRate -> ordersChoosenRate.getStatus() == OrderChoosenRateStatus.FINISHED)
                .map(orderRate -> postageLabelService.getByShipmentId(orderRate.getRate().getShipmentId()))
                .map(PostageLabelResponse::getLabelUrl)
                .toList();

        if (urls.isEmpty()) {
            log.warn("NOTHING TO SEND FOR ORDER ID {}", orderId);
            return;
        }

        notificationConsumerService.consume(NotificationWrapperMessage.builder()
                .to(toNotifyEmail)
                .title("Transaction receipt and shipping label(s)")
                .content("Thank you for your payment! You can find shipping label(s) in attachment.")
                .attachmentFilesUrl(urls)
                .type(NotificationType.EMAIL)
                .build());
    }

    @Override
    @Async
    @Transactional
    @Modifying
    public void saveEmailAndSendLabel(OrderEmailRequest request) {
        Order order = orderRepository.findById(request.getOrderId())
                .orElseThrow(() -> new ServiceValidationException("Order not found"));

        order.setToNotifyMailAddress(request.getEmail());
        orderRepository.save(order);

        sendLabels(request.getOrderId());
    }

    @Override
    public void sendInsufficientFunds(String orderId, BigDecimal notEnoughAmount, String currency) {
        Order order = orderRepository.findById(orderId)
                .orElse(null);

        if(order == null || order.getToNotifyMailAddress() == null) {
            log.error("Order not found or to notify email is null");
            return;
        }

        notificationConsumerService.consume(NotificationWrapperMessage.builder()
                .to(order.getToNotifyMailAddress())
                .title("Transaction paid partially, additional amount must be paid")
                .content("Your transaction has been partially paid, you need to pay an additional amount %s %s \n %s"
                        .formatted(notEnoughAmount, currency, order.getInvoiceUrl()))
                .type(NotificationType.EMAIL)
                .build());
    }
}
