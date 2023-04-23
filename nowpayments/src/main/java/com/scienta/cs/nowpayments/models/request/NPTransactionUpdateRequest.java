package com.scienta.cs.nowpayments.models.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NPTransactionUpdateRequest implements Serializable {
    private static final long newSerialVersionUID = 1190536278266811217L;

    private Long paymentId ; //":5077125051,
    private Long transactionId ; //":"2",
    private String status ; //":"waiting",
    private String payAddress ; //":"0xd1cDE08A07cD25adEbEd35c3867a59228C09B606",
    private LocalDateTime createdAt ; //":"2021-04-12T14:22:54.942Z",
    private LocalDateTime updatedAt ; //":"2021-04-12T14:23:06.244Z",
    private String error;

    private Object details;
}
