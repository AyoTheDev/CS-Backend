package com.scienta.cs.nowpayments.models.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NPReplenishmentInvoiceCreateRequest {

      private BigDecimal priceAmount ;
      private String priceCurrency;//fiat currency
      private String orderId;
      private String orderDescription;
      private String ipnCallbackUrl;
      private String successUrl;
      private String cancelUrl;

}
