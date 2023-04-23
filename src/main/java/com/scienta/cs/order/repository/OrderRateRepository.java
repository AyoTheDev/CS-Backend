package com.scienta.cs.order.repository;

import com.scienta.cs.order.model.entity.OrdersChoosenRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRateRepository extends JpaRepository<OrdersChoosenRate, String> {

    @Query("select ocr from OrdersChoosenRate ocr where ocr.order.uuid =:orderId")
    List<OrdersChoosenRate> findAllByOrderId(@Param("orderId") String orderId);
}
