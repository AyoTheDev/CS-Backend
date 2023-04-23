package com.scienta.cs.cms;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class SettingDto {

    @JsonProperty("chargeRate")
    private BigDecimal chargeRate;

}
