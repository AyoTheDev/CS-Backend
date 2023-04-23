package com.scienta.cs.shipment.exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ShipmentServiceException extends RuntimeException {
    public ShipmentServiceException(String s) {
        super(s);
    }
}
