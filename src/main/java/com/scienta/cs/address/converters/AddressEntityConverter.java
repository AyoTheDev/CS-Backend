package com.scienta.cs.address.converters;

import com.scienta.cs.address.model.entity.Address;
import com.scienta.cs.easypost.address.models.AddressDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AddressEntityConverter implements Converter<AddressDto, Address> {
    @Override
    public Address convert(AddressDto source) {
        return Address.builder()
                .id(source.getId())
                .mode(source.getMode())
                .street1(source.getStreet1())
                .street2(source.getStreet2())
                .city(source.getCity())
                .state(source.getState())
                .zip(source.getZip())
                .country(source.getCountry())
                .residential(source.getResidential())
                .carrierFacility(source.getCarrierFacility())
                .name(source.getName())
                .company(source.getCompany())
                .phone(source.getPhone())
                .email(source.getEmail())
                .federalTaxId(source.getFederalTaxId())
                .stateTaxId(source.getStateTaxId())
                .build();
    }
}
