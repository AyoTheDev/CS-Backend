package com.scienta.cs.nowpayments.clients;

import com.scienta.cs.nowpayments.models.response.NPCreatePayoutResponse;
import com.scienta.cs.nowpayments.models.response.NPPayoutStatusResponse;
import com.scienta.cs.nowpayments.models.request.NPCreatePayoutRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "nowpayments-adapter-payout-client", url = "${feign.client.nowpayments-adapter.url}/payout")
public interface PayoutClient {

    @PostMapping("/create")
    NPCreatePayoutResponse createPayout(@RequestBody NPCreatePayoutRequest request);

    @GetMapping("/status/{payoutId}")
    NPPayoutStatusResponse getStatus(@PathVariable("payoutId") Long payoutId);

}
