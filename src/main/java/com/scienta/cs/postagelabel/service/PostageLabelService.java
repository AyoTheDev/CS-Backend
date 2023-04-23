package com.scienta.cs.postagelabel.service;

import com.scienta.cs.types.PostageLabelResponse;

import java.util.List;

public interface PostageLabelService {
    PostageLabelResponse getByShipmentId(String shipmentId);
}
