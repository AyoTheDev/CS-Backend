package com.scienta.cs.easypost.shipment.service;

import com.scienta.cs.easypost.shipment.models.ShipmentBuyRequest;
import com.scienta.cs.easypost.shipment.models.ShipmentCreateRequest;
import com.scienta.cs.easypost.shipment.models.ShipmentDto;

import java.util.List;
import java.util.Optional;

public interface EPShipmentService {

    Optional<ShipmentDto> create(ShipmentCreateRequest request);

    List<ShipmentDto> getList();

    Optional<ShipmentDto> buyShipment(ShipmentBuyRequest request);

    ShipmentDto convertLabelToPdf(String shipmentId);

}
