package com.scienta.cs.shipment.converter;

import com.scienta.cs.address.converters.AddressRequestConverter;
import com.scienta.cs.easypost.address.models.AddressDto;
import com.scienta.cs.easypost.parcel.models.ParcelDto;
import com.scienta.cs.easypost.shipment.models.OptionsDto;
import com.scienta.cs.easypost.shipment.models.ShipmentCreateRequest;
import com.scienta.cs.easypost.shipment.models.ShipmentDto;
import com.scienta.cs.easypost.shipment.models.enums.LabelFormat;
import com.scienta.cs.parcel.converter.ParcelRequestConverter;
import com.scienta.cs.types.ShipmentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ShipmentRequestConverter implements Converter<ShipmentRequest,ShipmentCreateRequest> {

    private final AddressRequestConverter addressConverter;
    private final ParcelRequestConverter parcelRequestConverter;

    @Value("${feign.client.easypost.mode}")
    private String mode;

    @Value("${settings.defaultCurrency}")
    private String defaultCurrency;

    @Override
    public ShipmentCreateRequest convert(ShipmentRequest source) {
        AddressDto toAddress = addressConverter.convert(source.getToAddress());
        AddressDto fromAddress = addressConverter.convert(source.getFromAddress());
        ParcelDto parcelDto = parcelRequestConverter.convert(source.getParcel());
        OptionsDto optionsDto = OptionsDto.builder()
                .currency(defaultCurrency)
                .labelFormat(LabelFormat.PDF.name())
                .deliveryConfirmation(source.getSignatureType().name())
                .build();

        return ShipmentCreateRequest.builder()
                .shipment(ShipmentDto.builder()
                        .mode(mode)
                        .fromAddress(fromAddress)
                        .toAddress(toAddress)
                        .parcel(parcelDto)
                        .options(optionsDto)
                        .build())
                .build();
    }

}
