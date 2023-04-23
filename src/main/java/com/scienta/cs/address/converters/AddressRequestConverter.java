package com.scienta.cs.address.converters;

import com.scienta.cs.easypost.address.models.AddressDto;
import com.scienta.cs.types.AddressRequest;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AddressRequestConverter implements Converter<AddressRequest,AddressDto> {

    @Override
    public AddressDto convert(AddressRequest source) {
        return AddressDto.builder()
                .name(source.getName())
                .city(source.getCity())
                .zip(source.getPostcode())
                .country(source.getCountry())
                .street1(source.getAddressLine1())
                .street2(source.getAddressLine2())
                .phone(source.getPhone())
                .state(source.getState())
                .build();
    }

}
