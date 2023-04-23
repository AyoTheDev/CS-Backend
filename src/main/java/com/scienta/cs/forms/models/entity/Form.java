package com.scienta.cs.forms.models.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.scienta.cs.shipment.repository.Shipment;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "form")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Form {
    @Id
    @Column(name = "id", nullable = false, length = 512)
    private String id;

    @ManyToOne
    @JoinColumn(name = "shipment_id")
    private Shipment shipment;
    private	String formType;//	The type of form that we returned, can be one of "high_value_report", "commercial_invoice", "cod_return_label", "order_summary", "cn22"
    private	String formUrl;//	The address we return the form back at
    private	Boolean submittedElectronically;//	If we have submitted the form to the carrier on behalf of the customer
    private LocalDateTime createdAt; //
    private	LocalDateTime updatedAt; //

}
