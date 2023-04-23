package com.scienta.cs.easypost.custominfo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomsInfoDto {

    private String id;//Unique, begins with 'cstinfo_'
    private String object;//'CustomsInfo'
    @JsonProperty("eel_pfc")
    private String eelPfc;//"EEL" or "PFC" less value than $2500: "NOEEI 30.37(a)"; value greater than $2500: see Customs Guide
    @JsonProperty("contents_type")
    private String contentsType;//"documents", "gift", "merchandise", "returned_goods", "sample", or "other"
    @JsonProperty("contents_explanation")
    private String contentsExplanation;//(max 255 characters) Human readable description of content. Required for certain carriers and always required if contents_type is "other"
    @JsonProperty("customs_certify")
    private Boolean customsCertify;//	Electronically certify the information provided
    @JsonProperty("customs_signer")
    private String customsSigner;//Required if customs_certify is true
    @JsonProperty("non_delivery_option")
    private String nonDeliveryOption;//"abandon" or "return", defaults to "return"
    @JsonProperty("restriction_type")
    private String restrictionType;//"none", "other", "quarantine", or "sanitary_phytosanitary_inspection"
    @JsonProperty("restriction_comments")
    private String restrictionComments;//Required if restriction_type is not "none"
    @JsonProperty("customs_items")
    private List<CustomItemDto> customsItems; //array	Describes products being shipped
    private String declaration;//A customs declaration message, available for eligible carriers
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
}
