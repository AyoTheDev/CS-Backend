package com.scienta.cs.easypost.shipment.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShipmentCreateRequest {

    private ShipmentDto shipment;

}
