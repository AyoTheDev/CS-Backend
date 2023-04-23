package com.scienta.cs.nowpayments.payout.services;

import com.scienta.cs.nowpayments.models.request.NPCreatePayoutRequest;
import com.scienta.cs.nowpayments.models.response.NPCreatePayoutResponse;
import com.scienta.cs.nowpayments.models.response.NPPayoutStatusResponse;

import java.util.TreeMap;

public interface PayoutService {

    NPCreatePayoutResponse payout(NPCreatePayoutRequest request);

    NPPayoutStatusResponse getPayoutStatus(Long payoutId);

    void callback(TreeMap<String, Object> request, String signature, Long transactionId);
}
