package com.scienta.cs.nowpayments.models.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NPPayoutRequestWithdrawal {
    private String address;
    private String currency;
    private BigDecimal fiatAmount; // used for setting the payout amount in fiat equivalent. Overrides "amount" parameter
    private String fiatCurrency; //used for determining fiat currency to get the fiat equivalent for. Required for "fiat_amount" parameter to work. DOES NOT override "currency" parameter. Payouts are made in crypto only, no fiat payouts are available
    private String extraId;
    private String ipnCallbackUrl;
    private BigDecimal amount; //optional because we use fiatAmount
}
