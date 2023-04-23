package com.scienta.cs.nowpayments.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NPReplenishmentInvoiceCreateResponse {

        private Long id;
        private String orderId;
        private String orderDescription;
        private BigDecimal priceAmount;
        private String priceCurrency;
        private String payCurrency;
        private String ipnCallbackUrl;
        private String invoiceUrl;
        private String successUrl;
        private String cancelUrl;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;


}
