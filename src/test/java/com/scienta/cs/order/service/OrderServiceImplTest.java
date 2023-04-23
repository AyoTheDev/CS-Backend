package com.scienta.cs.order.service;

import com.scienta.cs.core.exceptions.ServiceValidationException;
import com.scienta.cs.order.model.entity.Order;
import com.scienta.cs.order.repository.OrderRateRepository;
import com.scienta.cs.order.repository.OrderRepository;
import com.scienta.cs.rate.model.entity.Rate;
import com.scienta.cs.rate.repository.RateRepository;
import com.scienta.cs.shipment.repository.Shipment;
import com.scienta.cs.shipment.repository.ShipmentRepository;
import com.scienta.cs.types.OrderRequest;
import com.scienta.cs.types.OrderRequestInfo;
import com.scienta.cs.utils.MockDataUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

//@ExtendWith(MockitoExtension.class)
class OrderServiceImplTest {

//    @InjectMocks
    OrderServiceImpl orderService;

//    @Mock
    ShipmentRepository shipmentRepository;
//    @Mock
    RateRepository rateRepository;
//    @Mock
    OrderRepository orderRepository;
//    @Mock
    OrderRateRepository orderRateRepository;


//    @Test
    void initOrder_rateNotExist() {
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setOrderList(List.of(OrderRequestInfo.newBuilder()
                        .rateId("rate_somerandomstring")
                        .shipmentId("shp_somerandomstring")
                .build()));
        Mockito.when(orderRepository.save(Mockito.any(Order.class))).thenReturn(MockDataUtil.generateMockData(Order.class));

        assertThrows(ServiceValidationException.class,()->orderService.initOrder(orderRequest));
    }

//    @Test
    void initOrder_shipmentNotExist() {
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setOrderList(List.of(OrderRequestInfo.newBuilder()
                .rateId("rate_somerandomstring")
                .shipmentId("shp_somerandomstring")
                .build()));
        Mockito.when(rateRepository.findById(Mockito.anyString())).thenReturn(Optional.of(MockDataUtil.generateMockData(Rate.class)));
        Mockito.when(orderRepository.save(Mockito.any(Order.class))).thenReturn(MockDataUtil.generateMockData(Order.class));

        assertThrows(ServiceValidationException.class,()->orderService.initOrder(orderRequest));
    }


//    @Test
    void initOrder_shipmentDataNotCorrect() {
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setOrderList(List.of(OrderRequestInfo.newBuilder()
                .rateId("rate_somerandomstring")
                .shipmentId("shp_somerandomstring")
                .build()));
        Mockito.when(rateRepository.findById(Mockito.anyString())).thenReturn(Optional.of(MockDataUtil.generateMockData(Rate.class)));
        Mockito.when(shipmentRepository.findById(Mockito.anyString())).thenReturn(Optional.of(MockDataUtil.generateMockData(Shipment.class)));
        Mockito.when(orderRepository.save(Mockito.any(Order.class))).thenReturn(MockDataUtil.generateMockData(Order.class));

        assertThrows(ServiceValidationException.class,()->orderService.initOrder(orderRequest));
    }


//    @Test
    void initOrder_Exist() {
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setOrderList(List.of(OrderRequestInfo.newBuilder()
                .rateId("rate_somerandomstring")
                .shipmentId("shp_somerandomstring")
                .build()));
        Mockito.when(rateRepository.findById(Mockito.anyString())).thenReturn(Optional.of(MockDataUtil.generateMockData(Rate.class)));
        Mockito.when(orderRepository.save(Mockito.any(Order.class))).thenReturn(MockDataUtil.generateMockData(Order.class));

        assertThrows(ServiceValidationException.class,()->orderService.initOrder(orderRequest));
    }



//    @Test
    void completeOrder() {

    }

//    @Test
    void getOrder() {
    }
}
