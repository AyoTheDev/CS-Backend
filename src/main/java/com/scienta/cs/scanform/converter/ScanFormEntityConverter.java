package com.scienta.cs.scanform.converter;

import com.scienta.cs.address.converters.AddressEntityConverter;
import com.scienta.cs.easypost.scanform.models.ScanFormDto;
import com.scienta.cs.scanform.model.entity.ScanForm;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ScanFormEntityConverter implements Converter<ScanFormDto, ScanForm> {

    private final AddressEntityConverter addressEntityConverter;

    @Override
    public ScanForm convert(ScanFormDto source) {

        if(source == null) {
            return null;
        }

        return ScanForm.builder()
                .id(source.getId())
                .status(source.getStatus())
                .message(source.getMessage())
                .address(addressEntityConverter.convert(source.getAddress()))
                .trackingCodes(source.getTrackingCodes())
                .formUrl(source.getFormUrl())
                .formFileType(source.getFormFileType())
                .batchId(source.getBatchId())
                .createdAt(source.getCreatedAt())
                .updatedAt(source.getUpdatedAt()).build();
    }
}
