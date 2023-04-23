package com.scienta.cs.nowpayments.replenishment.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NPUpadateInvoiceRequest {
    private String paymentId ; //":5077125051,
    private String paymentStatus ; //":"waiting",
    private String payAddress ; //":"0xd1cDE08A07cD25adEbEd35c3867a59228C09B606",
    private String priceAmount ; //":170,
    private String priceCurrency ; //":"usd",
    private String payAmount ; //":155.38559757,
    private String actuallyPaid ; //":0,
    private String payCurrency ; //":"mana",
    private String orderId ; //":"2",
    private String orderDescription ; //":"Apple Macbook Pro 2019 x 1",
    private String purchaseId ; //":"6084744717",
    private LocalDateTime createdAt ; //":"2021-04-12T14:22:54.942Z",
    private LocalDateTime updatedAt ; //":"2021-04-12T14:23:06.244Z",
    private String outcomeAmount ; //":1131.7812095,
    private String outcomeCurrency ; //":"trx"
    private String invoiceId;
}
