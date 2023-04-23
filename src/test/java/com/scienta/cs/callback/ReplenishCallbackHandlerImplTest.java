package com.scienta.cs.callback;

import com.scienta.cs.core.exceptions.ServiceValidationException;
import com.scienta.cs.nowpayments.models.TransactionStatus;
import com.scienta.cs.nowpayments.replenishment.models.NPUpadateInvoiceRequest;
import com.scienta.cs.order.model.entity.Order;
import com.scienta.cs.order.repository.OrderRepository;
import com.scienta.cs.shipment.services.ShipmentService;
import com.scienta.cs.utils.MockDataUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

//@ExtendWith(MockitoExtension.class)
class ReplenishCallbackHandlerImplTest {

//    @InjectMocks
    ReplenishCallbackHandlerImpl replenishCallbackHandler;

//    @Mock
    ShipmentService shipmentService;
//    @Mock
    OrderRepository orderRepository;

//    @Test()
    public void handle_order_not_found() {
        NPUpadateInvoiceRequest request = MockDataUtil.generateMockData(NPUpadateInvoiceRequest.class);

        assertThatThrownBy(()->replenishCallbackHandler.handle(request)).isInstanceOf(ServiceValidationException.class);
    }


//    @Test()
    public void handle_order_already_finished() {
        NPUpadateInvoiceRequest request = MockDataUtil.generateMockData(NPUpadateInvoiceRequest.class);
        Order order = MockDataUtil.generateMockData(Order.class);
        order.setStatus(TransactionStatus.FINISHED.name());
        Mockito.when(orderRepository.findById(request.getOrderId())).thenReturn(Optional.of(order));

        replenishCallbackHandler.handle(request);

        Mockito.verify(orderRepository, Mockito.never()).save(order);
//        Mockito.verify(shipmentService, Mockito.never()).buy(order);
    }

//    @Test()
    public void handle_order_finished() {
        NPUpadateInvoiceRequest request = MockDataUtil.generateMockData(NPUpadateInvoiceRequest.class);
        Order order = MockDataUtil.generateMockData(Order.class);
        order.setStatus(TransactionStatus.CREATED.name());
        Mockito.when(orderRepository.findById(request.getOrderId())).thenReturn(Optional.of(order));

        replenishCallbackHandler.handle(request);

        Mockito.verify(orderRepository, Mockito.atMostOnce()).save(order);
//        Mockito.verify(shipmentService, Mockito.atMostOnce()).buy(order);
    }


}
