package com.scienta.cs.nowpayments.clients;

import com.scienta.cs.nowpayments.models.request.NPCalculateRequest;
import com.scienta.cs.nowpayments.models.response.NPCalculationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "nowpayments-adapter-calculator-client", url = "${feign.client.nowpayments-adapter.url}/calculator")
public interface CalculatorClient {

    @GetMapping()
    NPCalculationResponse getEstimatePrice(NPCalculateRequest request);

}
