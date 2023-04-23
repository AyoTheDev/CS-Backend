package com.scienta.cs.postagelabel.fetcher;


import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.scienta.cs.postagelabel.service.PostageLabelService;
import com.scienta.cs.types.PostageLabelResponse;
import com.scienta.cs.types.RateResponse;
import lombok.RequiredArgsConstructor;

@DgsComponent
@RequiredArgsConstructor
public class PostageFetcher {

    private final PostageLabelService postageLabelService;

    @DgsData(parentType = "RateResponse", field = "postageLabel")
    public PostageLabelResponse getPostageLabelByRate(DgsDataFetchingEnvironment dfe) {
        RateResponse source = dfe.getSource();
        String shipmentId = source.getShipment_id();
        return postageLabelService.getByShipmentId(shipmentId);
    }


}
