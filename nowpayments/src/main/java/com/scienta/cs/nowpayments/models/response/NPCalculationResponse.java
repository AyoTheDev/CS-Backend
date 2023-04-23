package com.scienta.cs.nowpayments.models.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NPCalculationResponse {

    private String currencyFrom;
    private BigDecimal amountFrom;
    private String currencyTo;
    private BigDecimal estimatedAmount;

}
