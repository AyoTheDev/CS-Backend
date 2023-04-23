package com.scienta.cs.address.converters;

import com.scienta.cs.address.model.entity.Address;
import com.scienta.cs.easypost.address.models.AddressDto;
import com.scienta.cs.utils.MockDataUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@ExtendWith(MockitoExtension.class)
class AddressEntityConverterTest {

//    @InjectMocks
    AddressEntityConverter addressEntityConverter;

//    @Test
    public void convert_test(){
        AddressDto addressDto = MockDataUtil.generateMockData(AddressDto.class);

        Address address = addressEntityConverter.convert(addressDto);

        assertThat(address).isNotNull();
        assertThat(address.getCity()).isNotNull();
        assertThat(address.getId()).isEqualTo(addressDto.getId());
        assertThat(address.getMode()).isEqualTo(addressDto.getMode());
        assertThat(address.getStreet1()).isEqualTo(addressDto.getStreet1());
        assertThat(address.getStreet2()).isEqualTo(addressDto.getStreet2());
        assertThat(address.getCity()).isEqualTo(addressDto.getCity());
        assertThat(address.getState()).isEqualTo(addressDto.getState());
        assertThat(address.getZip()).isEqualTo(addressDto.getZip());
        assertThat(address.getCountry()).isEqualTo(addressDto.getCountry());
        assertThat(address.getResidential()).isEqualTo(addressDto.getResidential());
        assertThat(address.getCarrierFacility()).isEqualTo(addressDto.getCarrierFacility());
        assertThat(address.getName()).isEqualTo(addressDto.getName());
        assertThat(address.getCompany()).isEqualTo(addressDto.getCompany());
        assertThat(address.getPhone()).isEqualTo(addressDto.getPhone());
        assertThat(address.getEmail()).isEqualTo(addressDto.getEmail());
        assertThat(address.getFederalTaxId()).isEqualTo(addressDto.getFederalTaxId());
        assertThat(address.getStateTaxId()).isEqualTo(addressDto.getStateTaxId());
    }

}
