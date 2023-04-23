package com.scienta.cs.shipment.converter;

import com.scienta.cs.easypost.shipment.models.ShipmentDto;
import com.scienta.cs.rate.converter.RateResponseConverter;
import com.scienta.cs.types.ShipmentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ShipmentResponseConverter implements Converter<ShipmentDto, ShipmentResponse> {

    private final RateResponseConverter rateResponseConverter;

    @Override
    public ShipmentResponse convert(ShipmentDto source) {
        return ShipmentResponse.newBuilder()
                .id(source.getId())
                .from(source.getFromAddress().getAddressShortString())
                .to(source.getToAddress().getAddressShortString())
                .rateList(source.getRates()
                        .stream()
                        .map(rateResponseConverter::convert)
                        .collect(Collectors.toList()))
                .build();
    }

}
