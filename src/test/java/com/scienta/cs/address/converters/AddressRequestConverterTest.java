package com.scienta.cs.address.converters;

import com.scienta.cs.address.model.entity.Address;
import com.scienta.cs.easypost.address.models.AddressDto;
import com.scienta.cs.types.AddressRequest;
import com.scienta.cs.utils.MockDataUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@ExtendWith(MockitoExtension.class)
class AddressRequestConverterTest {

//    @InjectMocks
    AddressRequestConverter addressRequestConverter;

//    @Test
    public void convert_test(){
        AddressRequest request = MockDataUtil.generateMockData(AddressRequest.class);

        AddressDto address = addressRequestConverter.convert(request);

        assertThat(address).isNotNull();
        assertThat(address.getCity()).isNotNull();
        assertThat(address.getCity()).isEqualTo(request.getCity());
        assertThat(address.getCountry()).isEqualTo(request.getCountry());
        assertThat(address.getName()).isEqualTo(request.getName());
        assertThat(address.getPhone()).isEqualTo(request.getPhone());
    }

}
