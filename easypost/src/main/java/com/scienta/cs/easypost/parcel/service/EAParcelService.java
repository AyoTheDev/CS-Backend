package com.scienta.cs.easypost.parcel.service;

import com.scienta.cs.easypost.parcel.models.ParcelCreateRequest;
import com.scienta.cs.easypost.parcel.models.ParcelDto;

public interface EAParcelService {

    ParcelDto create(ParcelCreateRequest request);

}
