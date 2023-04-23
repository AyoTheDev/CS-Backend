package com.scienta.cs.nowpayments.payout.services;

import com.scienta.cs.nowpayments.core.clients.NowpaymentsClient;
import com.scienta.cs.nowpayments.models.request.NPCreatePayoutRequest;
import com.scienta.cs.nowpayments.models.request.NPTransactionUpdateRequest;
import com.scienta.cs.nowpayments.models.response.NPCreatePayoutResponse;
import com.scienta.cs.nowpayments.models.response.NPPayoutResponseWithdrawal;
import com.scienta.cs.nowpayments.models.response.NPPayoutStatusResponse;
import com.scienta.cs.nowpayments.models.MQSender;
import com.scienta.cs.nowpayments.validator.CallbackRequestValidatorService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.TreeMap;

@Service
@RequiredArgsConstructor
@Slf4j
public class PayoutServiceImpl implements PayoutService {

    private final NowpaymentsClient nowpaymentsClient;
    private final CallbackRequestValidatorService requestValidatorService;
    private final ObjectMapper objectMapper;
    private final MQSender mqSender;

    @Override
    @SneakyThrows
    public NPCreatePayoutResponse payout(NPCreatePayoutRequest request) {
        log.info("STARTED MAKING PAYOUT, REQUEST {}", request);
        NPCreatePayoutResponse response = nowpaymentsClient.payout(request);
        log.info("FINISHED MAKING PAYOUT, RESPONSE {}", response);
        return response;
    }

    @Override
    public NPPayoutStatusResponse getPayoutStatus(Long payoutId) {
        log.info("PAYOUT STATUS BY ID={}", payoutId);
        NPPayoutStatusResponse payoutStatusResponse = nowpaymentsClient.getPayoutStatus(payoutId);
        log.info("PAYOUT STATUS BY ID={}, RESPONSE", payoutStatusResponse);
        return payoutStatusResponse;
    }

    @Override
    public void callback(TreeMap<String, Object> request, String signature, Long transactionId) {
        log.info("callback payout request = {}",request);
        requestValidatorService.validateRequest(request,signature);
        NPPayoutResponseWithdrawal mapped = objectMapper.convertValue(request, NPPayoutResponseWithdrawal.class);
        log.info("Converted dto = {}", mapped);
        mqSender.send(NPTransactionUpdateRequest
                .builder()
                .transactionId(transactionId)
                .payAddress(mapped.getAddress())
                .status(mapped.getStatus())
                .createdAt(mapped.getCreatedAt())
                .updatedAt(mapped.getUpdatedAt())
                .paymentId(mapped.getId())
                .details(request)
                .build());
    }

}
