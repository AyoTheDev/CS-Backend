package com.scienta.cs.order.service;

import com.scienta.cs.types.OrderEmailRequest;

import java.math.BigDecimal;

public interface OrderNotificationService {
    void sendLabels(String orderId);

    void saveEmailAndSendLabel(OrderEmailRequest request);

    void sendInsufficientFunds(String orderId, BigDecimal notEnoughAmount, String currency);
}
