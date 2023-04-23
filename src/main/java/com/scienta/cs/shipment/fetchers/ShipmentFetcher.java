package com.scienta.cs.shipment.fetchers;


import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.InputArgument;
import com.scienta.cs.batch.BatchCreatorServiceImpl;
import com.scienta.cs.shipment.services.ShipmentService;
import com.scienta.cs.types.ShipmentRequest;
import com.scienta.cs.types.ShipmentResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@DgsComponent
@RequiredArgsConstructor
@Slf4j
public class ShipmentFetcher {

    private final ShipmentService shipmentService;
    private final BatchCreatorServiceImpl batchCreatorService;

    @DgsMutation()
    public ShipmentResponse initShipment(@InputArgument ShipmentRequest request) {
        log.info("Shipment init request = {}", request);
        return shipmentService.init(request);
    }

    @DgsMutation
    public List<ShipmentResponse> importFromCsv(MultipartFile file) {
        return batchCreatorService.importFromCsv(file);
    }

}
