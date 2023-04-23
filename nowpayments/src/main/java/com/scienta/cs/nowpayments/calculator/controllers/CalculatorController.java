package com.scienta.cs.nowpayments.calculator.controllers;

import com.scienta.cs.nowpayments.models.response.NPCalculationResponse;
import com.scienta.cs.nowpayments.calculator.services.CalculatorService;
import com.scienta.cs.nowpayments.clients.CalculatorClient;
import com.scienta.cs.nowpayments.models.request.NPCalculateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/calculator")
@RequiredArgsConstructor
public class CalculatorController implements CalculatorClient {

    private final CalculatorService calculatorService;

    @GetMapping()
    @Override
    public NPCalculationResponse getEstimatePrice(NPCalculateRequest request) {
        return calculatorService.getEstimatePrice(request);
    }
}
