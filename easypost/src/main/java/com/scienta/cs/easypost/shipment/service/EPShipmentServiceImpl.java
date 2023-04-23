package com.scienta.cs.easypost.shipment.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.scienta.cs.easypost.core.clients.EasyPostApiClient;
import com.scienta.cs.easypost.core.models.request.ConvertLabelFormatRequest;
import com.scienta.cs.easypost.shipment.models.ShipmentBuyRequest;
import com.scienta.cs.easypost.shipment.models.ShipmentCreateRequest;
import com.scienta.cs.easypost.shipment.models.ShipmentDto;
import com.scienta.cs.easypost.shipment.models.enums.LabelFormat;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class EPShipmentServiceImpl implements EPShipmentService {

    private final EasyPostApiClient apiClient;
    @Value("${feign.client.easypost.apiToken}")
    private String apitoken;
    private final ObjectMapper objectMapper;

    @Override
    public Optional<ShipmentDto> create(ShipmentCreateRequest request) {
        ShipmentDto result = apiClient.createShipment(request);
        return Optional.of(result);
    }

    @Override
    public Optional<ShipmentDto> buyShipment(ShipmentBuyRequest request) {
        return Optional.of(apiClient.buy(request.getShipmentId(),request));
    }


    /**
     *  EasyPost api doesn't follow HTTP spec which says:
     *   A payload within a GET request message has no defined semantics;
     * * sending a payload body on a GET request might cause some existing implementations to reject the request
    * */
    @SneakyThrows
    @Override
    public ShipmentDto convertLabelToPdf(String shipmentId) {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.easypost.com/v2/shipments/%s/label".formatted(shipmentId)))
                .header("Content-Type", "application/json")
                .header("Authorization", "Basic RVpUS2VkOGIxMWFkYzQxMzRlYmVhY2EwMDI5MmNlNDM0NGQ3YTdSTTkzTGRNUUhZNktWc1VVNkNmZzo=")
                .method("GET", HttpRequest.BodyPublishers.ofString("{\n    \"file_format\": \"%s\"\n}".formatted(LabelFormat.PDF.name())))
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        log.info(response.body());

        return objectMapper.readValue(response.body(), ShipmentDto.class);
    }

    @Override
    public List<ShipmentDto> getList() {
        return null;
    }
}
