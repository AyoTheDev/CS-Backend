package com.scienta.cs.nowpayments.models;

import com.scienta.cs.nowpayments.models.request.NPTransactionUpdateRequest;

public interface MQSender {
    void send(NPTransactionUpdateRequest notificationMQMessage);

}
