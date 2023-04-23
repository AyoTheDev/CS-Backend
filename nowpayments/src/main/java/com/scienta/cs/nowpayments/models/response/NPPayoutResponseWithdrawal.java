package com.scienta.cs.nowpayments.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NPPayoutResponseWithdrawal {

    private Long id;//": "5000000000",
    private String address;//": "TEmGwPeRTPiLFLVfBxXkSP91yc5GMNQhfS",
    private String currency;//": "trx",
    private BigDecimal amount;//": "200",
    private Long batchWithdrawalId;//": "5000000000",
    private String status;//": "WAITING",
    private String extraId;//": null,
    private String hash;//": null,
    private String error;//": null,
    private LocalDateTime createdAt;//": "2020-11-12T17:06:12.791Z",
    private LocalDateTime requestedAt;//": null,
    private LocalDateTime updatedAt;//": null


}
