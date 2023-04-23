package com.scienta.cs.easypost.shipment.models;

import com.scienta.cs.easypost.rate.models.RateDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShipmentBuyRequest {

    private String shipmentId;
    private RateDto rate;

}
