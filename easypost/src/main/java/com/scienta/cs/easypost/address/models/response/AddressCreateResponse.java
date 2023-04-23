package com.scienta.cs.easypost.address.models.response;

import com.scienta.cs.easypost.address.models.AddressDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressCreateResponse {

    private AddressDto address;

}
