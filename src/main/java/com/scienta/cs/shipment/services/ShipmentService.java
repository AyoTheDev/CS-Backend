package com.scienta.cs.shipment.services;

import com.scienta.cs.easypost.shipment.models.ShipmentBuyRequest;
import com.scienta.cs.easypost.shipment.models.ShipmentDto;
import com.scienta.cs.order.model.entity.Order;
import com.scienta.cs.types.ShipmentRequest;
import com.scienta.cs.types.ShipmentResponse;

import java.util.Optional;

public interface ShipmentService {
    ShipmentResponse init(ShipmentRequest request);
    ShipmentDto buy(ShipmentBuyRequest build);
}
