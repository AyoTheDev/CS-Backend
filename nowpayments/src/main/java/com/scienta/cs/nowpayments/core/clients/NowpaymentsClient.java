package com.scienta.cs.nowpayments.core.clients;

import com.scienta.cs.nowpayments.core.clients.interceptor.AuthResponse;
import com.scienta.cs.nowpayments.core.clients.models.AuthRequest;
import com.scienta.cs.nowpayments.core.clients.settings.NowpaymentsClientConfiguration;
import com.scienta.cs.nowpayments.models.request.NPCalculateRequest;
import com.scienta.cs.nowpayments.models.request.NPCreatePayoutRequest;
import com.scienta.cs.nowpayments.models.request.NPReplenishmentInvoiceCreateRequest;
import com.scienta.cs.nowpayments.models.response.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "nowpayments-client", url = "${feign.client.nowpayments.url}", configuration = NowpaymentsClientConfiguration.class)
public interface NowpaymentsClient {

    @GetMapping("/full-currencies")
    NPCurrencyListResponse getCurrencies();

    @GetMapping("/estimate")
    NPCalculationResponse getEstimatePrice(NPCalculateRequest request);

    @PostMapping("/invoice")
    NPReplenishmentInvoiceCreateResponse createInvoice(@RequestBody NPReplenishmentInvoiceCreateRequest request);

    @PostMapping("/auth")
    AuthResponse auth(@RequestBody AuthRequest authRequest);

    @PostMapping("/payout")
    NPCreatePayoutResponse payout(@RequestBody NPCreatePayoutRequest payoutRequest);

    @GetMapping("/payout/{payoutId}")
    NPPayoutStatusResponse getPayoutStatus(@PathVariable("payoutId") Long payoutId);
}
