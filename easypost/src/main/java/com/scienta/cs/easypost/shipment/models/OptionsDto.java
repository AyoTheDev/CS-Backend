package com.scienta.cs.easypost.shipment.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OptionsDto {

    private String currency;
    @JsonProperty("label_format")
    private String labelFormat;
    @JsonProperty("delivery_confirmation")
    private String deliveryConfirmation;

}
