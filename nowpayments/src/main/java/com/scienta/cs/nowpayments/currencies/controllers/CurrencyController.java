package com.scienta.cs.nowpayments.currencies.controllers;

import com.scienta.cs.nowpayments.clients.CurrencyClient;
import com.scienta.cs.nowpayments.currencies.services.CurrencyService;
import com.scienta.cs.nowpayments.models.response.NPCurrencyListResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency")
@RequiredArgsConstructor
public class CurrencyController implements CurrencyClient {

    private final CurrencyService currencyService;

    @Override
    @GetMapping("/list")
    public NPCurrencyListResponse getCurrencies() {
        return currencyService.getCurrencies();
    }
}
