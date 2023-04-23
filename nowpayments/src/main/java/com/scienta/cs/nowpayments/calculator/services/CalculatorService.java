package com.scienta.cs.nowpayments.calculator.services;

import com.scienta.cs.nowpayments.models.response.NPCalculationResponse;
import com.scienta.cs.nowpayments.models.request.NPCalculateRequest;

public interface CalculatorService {
    NPCalculationResponse getEstimatePrice(NPCalculateRequest request);
}
