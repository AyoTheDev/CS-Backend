package com.scienta.cs.rate.model.entity;

import com.scienta.cs.shipment.repository.Shipment;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "rate")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Rate {
    @Id
    @Column(name = "id", nullable = false, length = 512)
    private String id;

    private String mode;
    private String service;
    private String carrier;
    private String carrierAccountId;
    private String shipmentId;
    private Float rate;
    private String currency;
    private String retailRate;
    private String retailCurrency;
    private String listRate;
    private String listCurrency;
    private Integer deliveryDays;
    private String deliveryDate;
    private Boolean deliveryDateGuaranteed;
    private String billingType;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
