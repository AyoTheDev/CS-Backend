package com.scienta.cs.order.fetcher;


import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import com.scienta.cs.order.service.OrderNotificationService;
import com.scienta.cs.order.service.OrderService;
import com.scienta.cs.types.*;
import lombok.RequiredArgsConstructor;

@DgsComponent
@RequiredArgsConstructor
public class OrderFetcher {

    private final OrderService orderService;
    private final OrderNotificationService orderNotificationService;

    @DgsMutation()
    public OrderResponse initOrder(@InputArgument OrderRequest request) {
        return orderService.initOrder(request);
    }

    @DgsMutation()
    public OrderCompleteResponse completeOrder(@InputArgument OrderCompleteRequest request) {
        return orderService.completeOrderProcessing(request);
    }

    @DgsMutation()
    public Boolean sendLabelsToEmail(@InputArgument OrderEmailRequest request) {
        orderNotificationService.saveEmailAndSendLabel(request);
        return true;
    }

    @DgsQuery
    public OrderGetResponse getOrder(@InputArgument OrderGetRequest request) {
        return orderService.getOrder(request);
    }


}
