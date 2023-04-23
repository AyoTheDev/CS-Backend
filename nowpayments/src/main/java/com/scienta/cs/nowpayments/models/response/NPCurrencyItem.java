package com.scienta.cs.nowpayments.models.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NPCurrencyItem {

    private Long id;;//": 121,

    private String code;//": "AAVE",
    private String name;//": "Aave",
    private Boolean enable;//": true,
    private String walletRegex;//": "^(0x)[0-9A-Fa-f]{40}$",
    private String priority;//": 127,
    private String extraIdExists;//": false,
    private String extraIdRegex;//": null,
    private String logoUrl;//": "/images/coins/aave.svg",
    private Boolean track;//": true,
    private String cgId;//": "aave",
    private Boolean isMaxlimit;//": false,
    private String network;//": "eth",
    private String smartContract;//": null,
    private String networkPrecision;//": null

}
