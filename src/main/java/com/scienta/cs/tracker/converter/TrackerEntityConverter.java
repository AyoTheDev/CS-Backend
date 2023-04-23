package com.scienta.cs.tracker.converter;

import com.scienta.cs.easypost.tracker.models.TrackerDto;
import com.scienta.cs.fee.converter.FeeEntityConverter;
import com.scienta.cs.tracker.model.entity.Tracker;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class TrackerEntityConverter implements Converter<TrackerDto, Tracker> {

    private final FeeEntityConverter feeEntityConverter;

    @Override
    public Tracker convert(TrackerDto source) {

        if(source == null) {
            return null;
        }

        return Tracker.builder()
                .id(source.getId())
                .mode(source.getMode())
                .trackingCode(source.getTrackingCode())
                .status(source.getStatus())
                .signedBy(source.getSignedBy())
                .weight(source.getWeight())
                .estDeliveryDate(source.getEstDeliveryDate())
                .shipmentId(source.getShipmentId())
                .carrier(source.getCarrier())
                .publicUrl(source.getPublicUrl())
                .fees(source.getFees().stream().map(feeEntityConverter::convert).collect(Collectors.toList()))
                .createdAt(source.getCreatedAt())
                .updatedAt(source.getUpdatedAt())
                .build();
    }
}
