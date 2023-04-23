package com.scienta.cs.fee.model.entity;

import com.scienta.cs.shipment.repository.Shipment;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "fee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@SequenceGenerator(
        name = "seq",
        sequenceName = "s_fees",
        initialValue = 1,
        allocationSize = 1
)
public class Fee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "shipment_id")
    private Shipment shipment;
    private String type;//	The name of the category of fee. Possible types are "LabelFee", "PostageFee", "InsuranceFee", and "TrackerFee"
    private String amount;//	USD value with sub-cent precision
    private Boolean charged;//	Whether EasyPost has successfully charged your account for the fee
    private Boolean refunded;//	Whether the Fee has been refunded successfully
}
