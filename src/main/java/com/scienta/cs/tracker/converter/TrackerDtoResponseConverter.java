package com.scienta.cs.tracker.converter;

import com.scienta.cs.easypost.tracker.models.TrackerDto;
import com.scienta.cs.easypost.tracker.models.TrackingDetailDto;
import com.scienta.cs.types.TrackerResponse;
import com.scienta.cs.types.TrackingDetailResponse;
import com.scienta.cs.types.TrackingLocation;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.stream.Collectors;

@Component
public class TrackerDtoResponseConverter implements Converter<TrackerDto,TrackerResponse> {

    @Override
    public TrackerResponse convert(TrackerDto source) {
        TrackerResponse response =  TrackerResponse.newBuilder()
                .shipmentId(source.getShipmentId())
                .carrier(source.getCarrier())
                .id(source.getId())
                .trackingCode(source.getTrackingCode())
                .status(source.getStatus())
                .signedBy(source.getSignedBy())
                .weight(source.getWeight() != null ? source.getWeight().doubleValue() : null)
                .estDeliveryDate(source.getEstDeliveryDate() != null ? source.getEstDeliveryDate().toString() : null)
                .publicUrl(source.getPublicUrl())
                .build();

        if(!CollectionUtils.isEmpty(source.getTrackingDetails())) {
            response.setTrackingDetails(source.getTrackingDetails().stream().map(this::convertDetail)
                    .collect(Collectors.toList()));
        }

        return response;
    }


    private TrackingDetailResponse convertDetail(TrackingDetailDto source) {
        TrackingDetailResponse response = TrackingDetailResponse.newBuilder()
                .message(source.getMessage())
                .source(source.getSource())
                .datetime(source.getDatetime() != null ? source.getDatetime().toString() : null)
                .trackingLocation(convertLocation(source))
                .build();

        return response;
    }

    private TrackingLocation convertLocation(TrackingDetailDto source) {

        if(source.getTrackingLocation() == null) {
            return null;
        }

        return TrackingLocation.newBuilder()
                .city(source.getTrackingLocation().getCity())
                .country(source.getTrackingLocation().getCountry())
                .zip(source.getTrackingLocation().getZip())
                .state(source.getTrackingLocation().getState())
                .build();
    }

}
