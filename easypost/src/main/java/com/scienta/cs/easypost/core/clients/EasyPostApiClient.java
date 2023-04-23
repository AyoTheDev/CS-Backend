package com.scienta.cs.easypost.core.clients;

import com.scienta.cs.easypost.address.models.AddressCreateRequest;
import com.scienta.cs.easypost.address.models.AddressDto;
import com.scienta.cs.easypost.address.models.response.AddressCreateResponse;
import com.scienta.cs.easypost.core.clients.settings.EasyPostApiClientConfiguration;
import com.scienta.cs.easypost.core.models.request.ConvertLabelFormatRequest;
import com.scienta.cs.easypost.parcel.models.ParcelCreateRequest;
import com.scienta.cs.easypost.parcel.models.ParcelDto;
import com.scienta.cs.easypost.shipment.models.ShipmentBuyRequest;
import com.scienta.cs.easypost.shipment.models.ShipmentCreateRequest;
import com.scienta.cs.easypost.shipment.models.ShipmentDto;
import com.scienta.cs.easypost.shipment.models.enums.LabelFormat;
import com.scienta.cs.easypost.tracker.models.TrackerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "easypost-client", url = "${feign.client.easypost.url}", configuration = EasyPostApiClientConfiguration.class)
public interface EasyPostApiClient {

    @PostMapping("/addresses/create_and_verify")
    AddressCreateResponse createAddressAndVerify(@RequestBody AddressCreateRequest request);

    @PostMapping("/addresses")
    AddressDto create(@RequestBody AddressCreateRequest request);

    @PostMapping("/parcels")
    ParcelDto createParcel(@RequestBody ParcelCreateRequest request);

    @PostMapping("/shipments")
    ShipmentDto createShipment(ShipmentCreateRequest request);

    @PostMapping("/shipments/{id}/buy")
    ShipmentDto buy(@PathVariable("id") String shipmentId,@RequestBody ShipmentBuyRequest request);

    @GetMapping("/trackers/{id}")
    TrackerDto getTrackingInfo(@PathVariable("id") String id);

}
