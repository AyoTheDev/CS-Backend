package com.scienta.cs.nowpayments.clients;

import com.scienta.cs.nowpayments.models.request.NPReplenishmentInvoiceCreateRequest;
import com.scienta.cs.nowpayments.models.response.NPReplenishmentInvoiceCreateResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "nowpayments-adapter-replenishment-client", url = "${feign.client.nowpayments-adapter.url}/replenishment")
public interface ReplenishmentClient {

    @PostMapping("/invoice")
    NPReplenishmentInvoiceCreateResponse createInvoice(@RequestBody NPReplenishmentInvoiceCreateRequest request);

}
