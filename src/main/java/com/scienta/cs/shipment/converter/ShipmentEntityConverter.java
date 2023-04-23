package com.scienta.cs.shipment.converter;

import com.scienta.cs.address.converters.AddressEntityConverter;
import com.scienta.cs.easypost.shipment.models.ShipmentDto;
import com.scienta.cs.fee.converter.FeeEntityConverter;
import com.scienta.cs.forms.converter.FormEntityConverter;
import com.scienta.cs.parcel.converter.ParcelEntityConverter;
import com.scienta.cs.rate.converter.RateEntityConverter;
import com.scienta.cs.scanform.converter.ScanFormEntityConverter;
import com.scienta.cs.shipment.repository.Shipment;
import com.scienta.cs.tracker.converter.TrackerEntityConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ShipmentEntityConverter implements Converter<ShipmentDto,Shipment> {

    private final FeeEntityConverter feeEntityConverter;
    private final TrackerEntityConverter trackerEntityConverter;
    private final PostageLabelEntityConverter postageLabelConverter;
    private final RateEntityConverter rateEntityConverter;
    private final ScanFormEntityConverter scanFormEntityConverter;
    private final FormEntityConverter formEntityConverter;
    private final AddressEntityConverter addressEntityConverter;
    private final ParcelEntityConverter parcelEntityConverter;

    @Override
    public Shipment convert(ShipmentDto source) {

        return Shipment.builder()
                .id(source.getId())
                .mode(source.getMode())
                .toAddress(addressEntityConverter.convert(source.getToAddress()))
                .fromAddress(addressEntityConverter.convert(source.getFromAddress()))
                .parcel(parcelEntityConverter.convert(source.getParcel()))
//                .customsInfo(source.getCustomsInfo())
                .insurance(source.getInsurance())
                .trackingCode(source.getTrackingCode())
                .uspsZone(source.getUspsZone())
                .status(source.getStatus())
                .refundStatus(source.getRefundStatus())
                .batchId(source.getBatchId())
                .batchStatus(source.getBatchStatus())
                .batchMessage(source.getBatchMessage())
                .createdAt(source.getCreatedAt())
                .updatedAt(source.getUpdatedAt())
                .tracker(trackerEntityConverter.convert(source.getTracker()))
                .postageLabel(postageLabelConverter.convert(source.getPostageLabel()))
                .scanForm(scanFormEntityConverter.convert(source.getScanForm()))
                .fees(source.getFees().stream().map(feeEntityConverter::convert).collect(Collectors.toList()))
                .rates(source.getRates().stream().map(rateEntityConverter::convert).collect(Collectors.toList()))
                .forms(source.getForms().stream().map(formEntityConverter::convert).collect(Collectors.toList()))
                .build();


    }
}
