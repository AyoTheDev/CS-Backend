package com.scienta.cs.parcel.converter;

import com.scienta.cs.easypost.parcel.models.ParcelDto;
import com.scienta.cs.parcel.model.entity.Parcel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ParcelEntityConverter implements Converter<ParcelDto, Parcel> {
    @Override
    public Parcel convert(ParcelDto source) {
        return Parcel.builder()
                .id(source.getId())
                .object(source.getObject())
                .mode(source.getMode())
                .length(source.getLength())
                .width(source.getWidth())
                .height(source.getHeight())
                .predefinedPackage(source.getPredefinedPackage())
                .weight(source.getWeight())
                .createdAt(source.getCreatedAt())
                .updatedAt(source.getUpdatedAt())
                .build();
    }
}
