package com.scienta.cs.easypost.tracker.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.scienta.cs.easypost.fee.models.FeeDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrackerDto {

    private String id; //	Unique identifier, begins with "trk_"
    private String object; //	"Tracker"
    private String mode; //	"test" or "production"
    @JsonProperty("tracking_code")
    private String trackingCode; //	The tracking code provided by the carrier
    private String status; //	The current status of the package, possible values are "unknown", "pre_transit", "in_transit", "out_for_delivery", "delivered", "available_for_pickup", "return_to_sender", "failure", "cancelled" or "error"
    @JsonProperty("signed_by")
    private String signedBy; //	The name of the person who signed for the package (if available)
    private Float weight; //	The weight of the package as measured by the carrier in ounces (if available)
    @JsonProperty("est_delivery_date")
    private LocalDateTime estDeliveryDate; //	The estimated delivery date provided by the carrier (if available)
    @JsonProperty("shipment_id")
    private String shipmentId; //	The id of the EasyPost Shipment object associated with the Tracker (if any)
    private String carrier; //	The name of the carrier handling the shipment
    @JsonProperty("tracking_details")
    private List<TrackingDetailDto> trackingDetails; // array	Array of the associated TrackingDetail objects
    @JsonProperty("carrier_detail")
    private CarrierDetailDto carrierDetail; //	The associated CarrierDetail object (if available)
    @JsonProperty("public_url")
    private String publicUrl; //	URL to a publicly-accessible html page that shows tracking details for this tracker
    private List<FeeDto> fees; // array	Array of the associated Fee objects
    @JsonProperty("created_at")
    private LocalDateTime createdAt; //
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt; //

}
