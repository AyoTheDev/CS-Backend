package com.scienta.cs.batch;

import com.opencsv.CSVReader;
import com.scienta.cs.core.exceptions.ServiceValidationException;
import com.scienta.cs.shipment.services.ShipmentService;
import com.scienta.cs.types.*;
import graphql.com.google.common.base.Strings;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class BatchCreatorServiceImpl implements BatchCreatorService {

    private final ShipmentService shipmentService;

    @Override
    public List<ShipmentResponse> importFromCsv(MultipartFile multipartFile) {
        List<ShipmentRequest> requestList = new ArrayList<>();
        try (var csvReader = new CSVReader(new InputStreamReader(multipartFile.getInputStream()))) {
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                ShipmentRequest shipmentRequest = parseRow(values);

                if (shipmentRequest == null) {
                    continue;
                }

                requestList.add(shipmentRequest);
            }
        } catch (Exception e) {
            log.error("error, cannot parse file");
        }

        if(requestList.isEmpty()) {
            throw new ServiceValidationException("Nothing to import");
        }

        return requestList.stream()
                .map(shipmentService::init)
                .collect(Collectors.toList());
    }

    private ShipmentRequest parseRow(String[] values) {
        try {
            return ShipmentRequest.newBuilder()
                    .fromAddress(parseRowAddressFrom(values))
                    .toAddress(parseRowAddressTo(values))
                    .parcel(parseRowParcel(values))
                    .signatureType(SignatureType.valueOf(values[21]))
                    .build();
        } catch (Exception e) {
            log.error("Cannot parse row {}",values,e);
            return null;
        }
    }

    private ParcelRequest parseRowParcel(String[] values) {

        Double weightLbs = Strings.isNullOrEmpty(values[3]) ? 0.0 : Double.parseDouble(values[3].replace(",","."));
        Double weightOz = Strings.isNullOrEmpty(values[4]) ? 0.0 : Double.parseDouble(values[4].replace(",","."));
        if (weightLbs != 0.0) {
            weightOz += weightLbs * 16;
        }


        return ParcelRequest.newBuilder()
                .length(Double.valueOf(values[0]))
                .width(Double.valueOf(values[1]))
                .height(Double.valueOf(values[2]))
                .weight(weightOz)
                .build();
    }

    private AddressRequest parseRowAddressTo(String[] values) {
        return AddressRequest.newBuilder()
                .name(values[13])
                .addressLine1(values[14])
                .addressLine2(values[15])
                .city(values[16])
                .state(values[17])
                .postcode(values[18])
                .country(values[19])
                .phone(values[20])
                .build();
    }

    private AddressRequest parseRowAddressFrom(String[] values) {
        return AddressRequest.newBuilder()
                .name(values[5])
                .addressLine1(values[6])
                .addressLine2(values[7])
                .city(values[8])
                .state(values[9])
                .postcode(values[10])
                .country(values[11])
                .phone(values[12])
                .build();
    }
}
