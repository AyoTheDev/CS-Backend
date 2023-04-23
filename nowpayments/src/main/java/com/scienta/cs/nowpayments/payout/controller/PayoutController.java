package com.scienta.cs.nowpayments.payout.controller;

import com.scienta.cs.nowpayments.clients.PayoutClient;
import com.scienta.cs.nowpayments.models.request.NPCreatePayoutRequest;
import com.scienta.cs.nowpayments.models.response.NPCreatePayoutResponse;
import com.scienta.cs.nowpayments.models.response.NPPayoutStatusResponse;
import com.scienta.cs.nowpayments.payout.services.PayoutService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.TreeMap;

@RestController
@RequestMapping("/payout")
@RequiredArgsConstructor
@Slf4j
public class PayoutController implements PayoutClient {

    private final PayoutService payoutService;

    @Override
    @PostMapping("/create")
    public NPCreatePayoutResponse createPayout(@RequestBody NPCreatePayoutRequest request) {
        return payoutService.payout(request);
    }

    @Override
    @GetMapping("/status/{payoutId}")
    public NPPayoutStatusResponse getStatus(@PathVariable("payoutId") Long payoutId) {
        return payoutService.getPayoutStatus(payoutId);
    }

    @PostMapping("/callback/{transactionId}")
    public void callback(@RequestBody TreeMap<String,Object> request,
                         @PathVariable("transactionId") Long transactionId,
                         @RequestHeader("x-nowpayments-sig") String signature) {
        log.info("PAYOUT CALLBACK request {} transactionId {}", request, transactionId);
        payoutService.callback(request, signature, transactionId);
    }
}
