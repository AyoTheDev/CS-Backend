package com.scienta.cs.easypost.verification.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VerificationDetails {
    private String latitude; // The latitude
    private String longitude; // The longitude
    @JsonProperty("time_zone")
    private String time_zone;//	The time zone the address is located in, IE: America/Los_Angeles
}
