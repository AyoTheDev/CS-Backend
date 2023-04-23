package com.scienta.cs.easypost.fee.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FeeDto {
    private String object;//	"Fee"
    private String type;//	The name of the category of fee. Possible types are "LabelFee", "PostageFee", "InsuranceFee", and "TrackerFee"
    private String amount;//	USD value with sub-cent precision
    private Boolean charged;//	Whether EasyPost has successfully charged your account for the fee
    private Boolean refunded;//	Whether the Fee has been refunded successfully
}
