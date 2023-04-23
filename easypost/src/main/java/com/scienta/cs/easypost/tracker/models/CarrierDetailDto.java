package com.scienta.cs.easypost.tracker.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarrierDetailDto {

    private String object; //	"CarrierDetail"
    private String service; //	The service level the associated shipment was shipped with (if available)
    @JsonProperty("container_type")
    private String containerType; //	The type of container the associated shipment was shipped in (if available)
    @JsonProperty("est_delivery_date_local")
    private String estDeliveryDateLocal; //	The estimated delivery date as provided by the carrier, in the local time zone (if available)
    @JsonProperty("est_delivery_time_local")
    private String estDeliveryTimeLocal; //	The estimated delivery time as provided by the carrier, in the local time zone (if available)
    @JsonProperty("origin_location")
    private String originLocation; //	The location from which the package originated, stringified for presentation (if available)
    @JsonProperty("origin_tracking_location")
    private TrackingLocation originTrackingLocation; //	The location from which the package originated, broken down by city/state/country/zip (if available)
    @JsonProperty("destination_location")
    private String destinationLocation; //	The location to which the package is being sent, stringified for presentation (if available)
    @JsonProperty("destination_tracking_location")
    private TrackingLocation destinationTrackingLocation; //	The location to which the package is being sent, broken down by city/state/country/zip (if available)
    @JsonProperty("guaranteed_delivery_date")
    private LocalDateTime guaranteedDeliveryDate; //	The date and time the carrier guarantees the package to be delivered by (if available)
    @JsonProperty("alternate_identifier")
    private String alternateIdentifier; //	The alternate identifier for this package as provided by the carrier (if available)
    @JsonProperty("initial_delivery_attempt")
    private LocalDateTime initialDeliveryAttempt; //	The date and time of the first attempt by the carrier to deliver the package (if available)

}
