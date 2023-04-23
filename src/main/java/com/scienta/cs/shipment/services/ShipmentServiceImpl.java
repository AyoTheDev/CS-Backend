package com.scienta.cs.shipment.services;

import com.scienta.cs.cms.CMSClient;
import com.scienta.cs.easypost.address.EPAddressService;
import com.scienta.cs.easypost.address.models.AddressCreateRequest;
import com.scienta.cs.easypost.rate.models.RateDto;
import com.scienta.cs.easypost.shipment.models.ShipmentBuyRequest;
import com.scienta.cs.easypost.shipment.models.ShipmentCreateRequest;
import com.scienta.cs.easypost.shipment.models.ShipmentDto;
import com.scienta.cs.easypost.shipment.service.EPShipmentService;
import com.scienta.cs.notification.core.models.enums.NotificationType;
import com.scienta.cs.notification.queue.models.messages.NotificationWrapperMessage;
import com.scienta.cs.notification.queue.services.NotificationConsumerService;
import com.scienta.cs.order.model.entity.Order;
import com.scienta.cs.order.model.entity.OrdersChoosenRate;
import com.scienta.cs.order.repository.OrderRateRepository;
import com.scienta.cs.shipment.converter.ShipmentEntityConverter;
import com.scienta.cs.shipment.converter.ShipmentRequestConverter;
import com.scienta.cs.shipment.converter.ShipmentResponseConverter;
import com.scienta.cs.shipment.exceptions.ShipmentServiceException;
import com.scienta.cs.shipment.repository.ShipmentRepository;
import com.scienta.cs.types.ShipmentRequest;
import com.scienta.cs.types.ShipmentResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ShipmentServiceImpl implements ShipmentService {

    private final EPShipmentService epShipmentService;
    private final EPAddressService epAddressService;
    private final ShipmentRequestConverter shipmentRequestConverter;
    private final ShipmentResponseConverter shipmentResponseConverter;
    private final ShipmentEntityConverter shipmentEntityConverter;
    private final OrderRateRepository orderRateRepository;
    private final CMSClient cmsClient;
    private final NotificationConsumerService notificationConsumerService;

    private final ShipmentRepository shipmentRepository;

    @Override
    public ShipmentResponse init(ShipmentRequest request) {
        ShipmentCreateRequest createRequest = shipmentRequestConverter.convert(request);
        verifyAndCreateAddress(createRequest);
        Optional<ShipmentDto> shipmentOptional = epShipmentService.create(createRequest);

        ShipmentDto dto = shipmentOptional.orElseThrow(()->new RuntimeException("Shipment is null"));
        dto = save(dto);
        return shipmentResponseConverter.convert(dto);
    }

    private void verifyAndCreateAddress(@NonNull ShipmentCreateRequest request) {
        request.getShipment().setFromAddress(epAddressService.createAndVerify(AddressCreateRequest.builder()
                        .address(request.getShipment().getFromAddress())
                .build()));

        request.getShipment().setToAddress(epAddressService.createAndVerify(AddressCreateRequest.builder()
                .address(request.getShipment().getToAddress())
                .build()));
    }

    private ShipmentDto save(ShipmentDto shipmentDto) {
        log.info("SAVE SHIPMENT= [{}]", shipmentDto);

        if (shipmentDto == null) {
            throw new ShipmentServiceException("Shipment creation exception, result is null");
        }

        changeRate(shipmentDto);

        shipmentRepository.save(shipmentEntityConverter.convert(shipmentDto));
        return shipmentDto;
    }

    @Override
    public ShipmentDto buy(ShipmentBuyRequest request) {
        ShipmentDto shipmentDto = epShipmentService.buyShipment(request)
                .orElseThrow();
        save(shipmentDto);
        return shipmentDto;
    }

    private void changeRate(ShipmentDto shipmentDto) {
       BigDecimal chargeRate = cmsClient.getSettings().getData().getAttributes().getChargeRate();
       shipmentDto.getRates().forEach(r->{
           Float rate = r.getRate();
           rate = rate + ((rate * chargeRate.floatValue()) / 100);

           r.setRate(rate);
       });

    }

}
