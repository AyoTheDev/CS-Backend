package com.scienta.cs.easypost.parcel.service;

import com.scienta.cs.easypost.core.clients.EasyPostApiClient;
import com.scienta.cs.easypost.parcel.models.ParcelCreateRequest;
import com.scienta.cs.easypost.parcel.models.ParcelDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EAParcelServiceImpl implements EAParcelService {

    private final EasyPostApiClient easyPostApiClient;

    @Override
    public ParcelDto create(ParcelCreateRequest request) {
        return easyPostApiClient.createParcel(request);
    }
}
