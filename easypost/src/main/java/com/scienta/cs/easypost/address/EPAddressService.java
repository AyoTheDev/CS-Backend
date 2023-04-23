package com.scienta.cs.easypost.address;

import com.scienta.cs.easypost.address.models.AddressCreateRequest;
import com.scienta.cs.easypost.address.models.AddressDto;

public interface EPAddressService {

    AddressDto createAndVerify(AddressCreateRequest request);

}
