package com.scienta.cs.rate.converter;

import com.scienta.cs.easypost.rate.models.RateDto;
import com.scienta.cs.order.service.OrderChoosenRateStatus;
import com.scienta.cs.rate.model.entity.Rate;
import com.scienta.cs.shipment.repository.Shipment;
import com.scienta.cs.shipment.repository.ShipmentRepository;
import com.scienta.cs.types.RateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RateResponseConverter implements Converter<RateDto,RateResponse> {

    private final ShipmentRepository shipmentRepository;

    @Override
    public RateResponse convert(RateDto source) {
        return RateResponse.newBuilder()
                .id(source.getId())
                .delivery_date_guaranteed(source.getDeliveryDateGuaranteed())
                .object(source.getObject())
                .service(source.getService())
                .billing_type(source.getBillingType())
                .currency(source.getCurrency())
                .carrier(source.getCarrier())
                .rate(source.getRate().doubleValue())
                .delivery_date(source.getDeliveryDate())
                .delivery_days(source.getDeliveryDays())
                .shipment_id(source.getShipmentId())
                .build();
    }

    public RateResponse convertFromEntity(Rate source, OrderChoosenRateStatus status) {
        return RateResponse.newBuilder()
                .id(source.getId())
                .delivery_date_guaranteed(source.getDeliveryDateGuaranteed())
                .object("Rate")
                .service(source.getService())
                .billing_type(source.getBillingType())
                .currency(source.getCurrency())
                .description(getDescription(source))
                .carrier(source.getCarrier())
                .rate(source.getRate().doubleValue())
                .delivery_date(source.getDeliveryDate())
                .delivery_days(source.getDeliveryDays())
                .shipment_id(source.getShipmentId())
                .status(status != null ? status.name() : null)
                .build();
    }

    private String getDescription(Rate source) {

        Shipment shipment = shipmentRepository.findById(source.getShipmentId()).orElse(null);

        if(shipment == null) {
            return "";
        }

       return  "%s %s - %s (%s) to %s (%s)".formatted(
                source.getCarrier(), source.getService(),
               shipment.getFromAddress().getName(),
               shipment.getFromAddress().getCity(),
               shipment.getToAddress().getName(),
               shipment.getToAddress().getCity()
        );
    }
}
