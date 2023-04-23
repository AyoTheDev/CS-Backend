package com.scienta.cs.easypost.message.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageDto {
    private String carrier;              //	the name of the carrier generating the error, e.g. "UPS"
    private String type;                 //	the category of error that occurred. Most frequently "rate_error"
    private String message;              //	the string from the carrier explaining the problem
    @JsonProperty("carrier_account_id")
    private String carrierAccountId;               //	the account id of the carrier. Useful if you have multiple accounts with the same carrier
}
