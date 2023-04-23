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
public class TrackingDetailDto {

    private String object;                //"TrackingDetail"
    private String message;                //Description of the scan event
    private String status;                //Status of the package at the time of the scan event, possible values are "unknown", "pre_transit", "in_transit", "out_for_delivery", "delivered", "available_for_pickup", "return_to_sender", "failure", "cancelled" or "error"
    private LocalDateTime datetime;                //The timestamp when the tracking scan occurred
    private String source;                //The original source of the information for this scan event, usually the carrier
    @JsonProperty("tracking_location")
    private TrackingLocation trackingLocation;                //The location associated with the scan event
}
