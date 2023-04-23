package com.scienta.cs.nowpayments.replenishment.services;

import com.scienta.cs.nowpayments.models.request.NPReplenishmentInvoiceCreateRequest;
import com.scienta.cs.nowpayments.models.request.NPTransactionUpdateRequest;
import com.scienta.cs.nowpayments.models.response.NPReplenishmentInvoiceCreateResponse;
import com.scienta.cs.nowpayments.core.clients.NowpaymentsClient;
import com.scienta.cs.nowpayments.models.MQSender;
import com.scienta.cs.nowpayments.replenishment.models.NPUpadateInvoiceRequest;
import com.scienta.cs.nowpayments.validator.CallbackRequestValidatorService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.TreeMap;

@Service
@RequiredArgsConstructor
@Slf4j
public class ReplenishmentServiceImpl implements ReplenishmentService {

    private final NowpaymentsClient nowpaymentsClient;

    @Value("${settings.replenishmentCallbackUrl}")
    private String replenishmentCallbackUrl;

    @Override
    public NPReplenishmentInvoiceCreateResponse createInvoice(NPReplenishmentInvoiceCreateRequest invoiceCreateRequest) {
        invoiceCreateRequest.setIpnCallbackUrl(replenishmentCallbackUrl);
        return nowpaymentsClient.createInvoice(invoiceCreateRequest);
    }

}
