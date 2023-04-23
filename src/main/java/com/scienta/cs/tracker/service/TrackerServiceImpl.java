package com.scienta.cs.tracker.service;

import com.scienta.cs.core.exceptions.ServiceValidationException;
import com.scienta.cs.easypost.core.clients.EasyPostApiClient;
import com.scienta.cs.easypost.tracker.models.TrackerDto;
import com.scienta.cs.shipment.repository.Shipment;
import com.scienta.cs.shipment.repository.ShipmentRepository;
import com.scienta.cs.tracker.converter.TrackerDtoResponseConverter;
import com.scienta.cs.tracker.model.entity.Tracker;
import com.scienta.cs.tracker.repository.TrackerRepository;
import com.scienta.cs.types.TrackerGetRequest;
import com.scienta.cs.types.TrackerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrackerServiceImpl implements TrackerService {

    private final ShipmentRepository shipmentRepository;
    private final TrackerRepository trackerRepository;
    private final EasyPostApiClient easyPostApiClient;
    private final TrackerDtoResponseConverter trackerDtoResponseConverter;

    @Override
    public TrackerResponse getByShipmentId(String shipmentId) {
       return null;
    }

    @Override
    public TrackerResponse getByCode(TrackerGetRequest request) {
        Tracker tracker = trackerRepository.getByTrackingCode(request.getCode())
                .orElseThrow(()->new ServiceValidationException("Tracker not found"));

        TrackerDto dto = easyPostApiClient.getTrackingInfo(tracker.getId());
        return trackerDtoResponseConverter.convert(dto);
    }
}
