package com.scienta.cs.order.service;

import com.scienta.cs.nowpayments.replenishment.models.NPUpadateInvoiceRequest;
import com.scienta.cs.order.model.entity.Order;
import com.scienta.cs.types.*;

public interface OrderService {

    OrderResponse initOrder(OrderRequest request);
    void finishOrder(Order order);
    OrderCompleteResponse completeOrderProcessing(OrderCompleteRequest request);

    OrderGetResponse getOrder(OrderGetRequest request);

    Boolean isFullPaid(NPUpadateInvoiceRequest request);
}
