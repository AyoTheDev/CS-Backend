package com.scienta.cs.parcel.converter;

import com.scienta.cs.easypost.parcel.models.ParcelDto;
import com.scienta.cs.types.ParcelRequest;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ParcelRequestConverter implements Converter<ParcelRequest, ParcelDto> {
    @Override
    public ParcelDto convert(ParcelRequest source) {
        return ParcelDto.builder()
                .height(source.getHeight().floatValue())
                .weight(source.getWeight().floatValue())
                .length(source.getLength().floatValue())
                .width(source.getWidth().floatValue())
                .build();
    }
}
