package com.scienta.cs.easypost.custominfo.models;

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
public class CustomItemDto {

    private String id           ;//	Unique, begins with 'cstitem_'
    private String object           ;//	'CustomsItem'
    private String description          ;//	Required, description of item being shipped
    private Float quantity          ;//	Required, greater than zero
    private Float value         ;// (USD)	Required, greater than zero, total value (unit value * quantity)
    private Float weight            ;// (oz)	Required, greater than zero, total weight (unit weight * quantity)
    @JsonProperty("hs_tariff_number")
    private String hsTariffNumber         ;//	Harmonized Tariff Schedule, e.g. "6109.10.0012" for Men's T-shirts
    private String code         ;//	SKU/UPC or other product identifier
    @JsonProperty("origin_country")
    private String originCountry           ;//	Required, 2 char country code
    private String currency         ;//	3 char currency code, default USD
    @JsonProperty("created_at")
    private LocalDateTime createdAt; //
    @JsonProperty("updated_at")
    private	LocalDateTime updatedAt; //

}
