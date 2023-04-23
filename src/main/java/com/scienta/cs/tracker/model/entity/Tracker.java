package com.scienta.cs.tracker.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.scienta.cs.easypost.fee.models.FeeDto;
import com.scienta.cs.easypost.tracker.models.CarrierDetailDto;
import com.scienta.cs.easypost.tracker.models.TrackingDetailDto;
import com.scienta.cs.fee.model.entity.Fee;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tracker")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tracker {
    @Id
    @Column(name = "id", nullable = false, length = 512)
    private String id;
    private String mode; //	"test" or "production"
    private String trackingCode; //	The tracking code provided by the carrier
    private String status; //	The current status of the package, possible values are "unknown", "pre_transit", "in_transit", "out_for_delivery", "delivered", "available_for_pickup", "return_to_sender", "failure", "cancelled" or "error"
    private String signedBy; //	The name of the person who signed for the package (if available)
    private Float weight; //	The weight of the package as measured by the carrier in ounces (if available)
    private LocalDateTime estDeliveryDate; //	The estimated delivery date provided by the carrier (if available)
    private String shipmentId; //	The id of the EasyPost Shipment object associated with the Tracker (if any)
    private String carrier; //	The name of the carrier handling the shipment
    private String publicUrl; //	URL to a publicly-accessible html page that shows tracking details for this tracker
    @OneToMany
    private List<Fee> fees; // array	Array of the associated Fee objects
    private LocalDateTime createdAt; //
    private LocalDateTime updatedAt; //

}
