package com.scienta.cs.nowpayments.clients;

import com.scienta.cs.nowpayments.models.response.NPCurrencyListResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "nowpayments-adapter-currency-client", url = "${feign.client.nowpayments-adapter.url}/currency")
public interface CurrencyClient {

    @GetMapping("/list")
    NPCurrencyListResponse getCurrencies();

}
