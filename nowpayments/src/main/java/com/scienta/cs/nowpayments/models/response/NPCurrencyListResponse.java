package com.scienta.cs.nowpayments.models.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NPCurrencyListResponse {

    private List<NPCurrencyItem> currencies;

}
