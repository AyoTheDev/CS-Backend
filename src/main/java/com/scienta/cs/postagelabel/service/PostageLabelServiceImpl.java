package com.scienta.cs.postagelabel.service;

import com.scienta.cs.easypost.core.clients.EasyPostApiClient;
import com.scienta.cs.easypost.core.models.request.ConvertLabelFormatRequest;
import com.scienta.cs.easypost.shipment.models.ShipmentDto;
import com.scienta.cs.easypost.shipment.models.enums.LabelFormat;
import com.scienta.cs.easypost.shipment.service.EPShipmentService;
import com.scienta.cs.notification.core.models.enums.NotificationType;
import com.scienta.cs.notification.queue.models.messages.NotificationWrapperMessage;
import com.scienta.cs.notification.queue.services.NotificationConsumerService;
import com.scienta.cs.postagelabel.model.entity.PostageLabel;
import com.scienta.cs.postagelabel.reposioty.PostageLabelRespository;
import com.scienta.cs.shipment.converter.PostageLabelEntityConverter;
import com.scienta.cs.shipment.repository.Shipment;
import com.scienta.cs.shipment.repository.ShipmentRepository;
import com.scienta.cs.types.PostageLabelResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostageLabelServiceImpl implements PostageLabelService {

    private final ShipmentRepository shipmentRepository;

    @Override
    public PostageLabelResponse getByShipmentId(String shipmentId) {
        Shipment shipment = shipmentRepository.findById(shipmentId).orElseThrow();
        PostageLabel pl = shipment.getPostageLabel();

        if(shipment.getPostageLabel() != null) {
            return PostageLabelResponse.newBuilder()
                    .id(pl.getId())
                    .labelDate(pl.getLabelDate().toString())
                    .labelEpl2Url(pl.getLabelEpl2Url())
                    .labelFileType(pl.getLabelFileType())
                    .labelPdfUrl(pl.getLabelPdfUrl())
                    .labelResolution(pl.getLabelResolution())
                    .labelSize(pl.getLabelSize())
                    .labelType(pl.getLabelType())
                    .labelUrl(pl.getLabelUrl())
                    .labelZplUrl(pl.getLabelZplUrl())
                    .build();
        }

        return null;
    }

}
