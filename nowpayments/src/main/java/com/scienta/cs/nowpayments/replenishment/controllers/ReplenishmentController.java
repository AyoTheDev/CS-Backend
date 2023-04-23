package com.scienta.cs.nowpayments.replenishment.controllers;

import com.scienta.cs.nowpayments.models.response.NPReplenishmentInvoiceCreateResponse;
import com.scienta.cs.nowpayments.clients.ReplenishmentClient;
import com.scienta.cs.nowpayments.models.request.NPReplenishmentInvoiceCreateRequest;
import com.scienta.cs.nowpayments.replenishment.services.ReplenishCallbackHandler;
import com.scienta.cs.nowpayments.replenishment.services.ReplenishmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.TreeMap;

@RestController
@RequestMapping("/replenishment")
@RequiredArgsConstructor
@Slf4j
public class ReplenishmentController implements ReplenishmentClient {

    private final ReplenishmentService replenishmentService;
    private final ReplenishCallbackHandler replenishCallbackHandler;


    @Override
    @PostMapping("/invoice")
    public NPReplenishmentInvoiceCreateResponse createInvoice(@RequestBody NPReplenishmentInvoiceCreateRequest request) {
        return replenishmentService.createInvoice(request);
    }

    @PostMapping("/callback")
    public void callback(@RequestBody TreeMap<String,Object> request,
                         @RequestHeader("x-nowpayments-sig") String signature) {
        log.info("signature: [{}]", signature);
        replenishCallbackHandler.callback(request, signature);
    }



}
