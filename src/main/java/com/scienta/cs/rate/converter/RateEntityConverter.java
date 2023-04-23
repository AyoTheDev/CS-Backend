package com.scienta.cs.rate.converter;

import com.scienta.cs.easypost.rate.models.RateDto;
import com.scienta.cs.rate.model.entity.Rate;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RateEntityConverter implements Converter<RateDto, Rate> {
    @Override
    public Rate convert(RateDto source) {
        return Rate.builder()
                .id(source.getId())
                .mode(source.getMode())
                .service(source.getService())
                .carrier(source.getCarrier())
                .carrierAccountId(source.getCarrierAccountId())
                .shipmentId(source.getShipmentId())
                .rate(source.getRate())
                .currency(source.getCurrency())
                .retailRate(source.getRetailRate())
                .retailCurrency(source.getRetailCurrency())
                .listRate(source.getListRate())
                .listCurrency(source.getListCurrency())
                .deliveryDays(source.getDeliveryDays())
                .deliveryDate(source.getDeliveryDate())
                .deliveryDateGuaranteed(source.getDeliveryDateGuaranteed())
                .billingType(source.getBillingType())
                .createdAt(source.getCreatedAt())
                .updatedAt(source.getUpdatedAt())
                .build();
    }
}
