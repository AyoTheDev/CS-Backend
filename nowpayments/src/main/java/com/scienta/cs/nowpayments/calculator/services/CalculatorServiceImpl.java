package com.scienta.cs.nowpayments.calculator.services;

import com.scienta.cs.nowpayments.models.response.NPCalculationResponse;
import com.scienta.cs.nowpayments.core.clients.NowpaymentsClient;
import com.scienta.cs.nowpayments.models.request.NPCalculateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CalculatorServiceImpl implements CalculatorService {

    private final NowpaymentsClient nowpaymentsClient;

    @Override
    public NPCalculationResponse getEstimatePrice(NPCalculateRequest request) {
        return nowpaymentsClient.getEstimatePrice(request);
    }
}
