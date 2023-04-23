package com.scienta.cs.nowpayments.currencies.services.impl;

import com.scienta.cs.nowpayments.core.clients.NowpaymentsClient;
import com.scienta.cs.nowpayments.models.response.NPCurrencyListResponse;
import com.scienta.cs.nowpayments.currencies.services.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrencyServiceImpl implements CurrencyService {

    private final NowpaymentsClient nowpaymentsClient;

    @Override
    public NPCurrencyListResponse getCurrencies() {
        return nowpaymentsClient.getCurrencies();
    }
}
