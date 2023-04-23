package com.scienta.cs.tracker.service;

import com.scienta.cs.types.TrackerGetRequest;
import com.scienta.cs.types.TrackerResponse;

public interface TrackerService {
    TrackerResponse getByShipmentId(String shipmentId);

    TrackerResponse getByCode(TrackerGetRequest request);
}
