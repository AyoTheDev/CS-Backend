package com.scienta.cs.nowpayments.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NPCreatePayoutResponse {
    private Long id;
    private List<NPPayoutResponseWithdrawal> withdrawals;
}
