package com.scienta.cs.easypost.tracker.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrackingLocation {

    private String object;//   	"TrackingLocation"
    private String city;// 	The city where the scan event occurred (if available)
    private String state;//    	The state where the scan event occurred (if available)
    private String country;//  	The country where the scan event occurred (if available)
    private String zip;//  	The postal code where the scan event occurred (if available)

}


