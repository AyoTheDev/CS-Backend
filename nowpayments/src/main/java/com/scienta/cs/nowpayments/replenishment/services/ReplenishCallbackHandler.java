package com.scienta.cs.nowpayments.replenishment.services;

import com.scienta.cs.nowpayments.replenishment.models.NPUpadateInvoiceRequest;

import java.util.TreeMap;

public interface ReplenishCallbackHandler {
    void handle(NPUpadateInvoiceRequest request);

    void callback(TreeMap<String, Object> request, String signature);
}
