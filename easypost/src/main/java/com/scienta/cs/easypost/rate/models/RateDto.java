package com.scienta.cs.easypost.rate.models;

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
public class RateDto {

    private String id;                  //	unique, begins with 'rate_'
    private String object;                  //	"Rate"
    private String mode;                    //	"test" or "production"
    private String service;                 //	service level/name
    private String carrier;                 //	name of carrier
    @JsonProperty("carrier_account_id")
    private String carrierAccountId;                  //	ID of the CarrierAccount record used to generate this rate
    @JsonProperty("shipment_id")
    private String shipmentId;                 //	ID of the Shipment this rate belongs to
    private Float rate;                    //	the actual rate quote for this service
    private String currency;                    //	currency for the rate
    @JsonProperty("retail_rate")
    private String retailRate;                 //	the retail rate is the in-store rate given with no account
    @JsonProperty("retail_currency")
    private String retailCurrency;                 //	currency for the retail rate
    @JsonProperty("list_rate")
    private String listRate;                   //	the list rate is the non-negotiated rate given for having an account with the carrier
    @JsonProperty("list_currency")
    private String listCurrency;                   //	currency for the list rate
    @JsonProperty("delivery_days")
    private Integer deliveryDays;                  //	delivery days for this service
    @JsonProperty("delivery_date")
    private String deliveryDate;                   //	date for delivery
    @JsonProperty("delivery_date_guaranteed")
    private Boolean deliveryDateGuaranteed;                   //	indicates if delivery window is guaranteed (true) or not (false)
    @JsonProperty("billing_type")
    private String billingType;                    //	Billing type of the rate
    @JsonProperty("created_at")
    private LocalDateTime createdAt;                   //;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;                   //;
}
