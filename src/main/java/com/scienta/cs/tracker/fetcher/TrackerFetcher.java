package com.scienta.cs.tracker.fetcher;


import com.netflix.graphql.dgs.*;
import com.scienta.cs.tracker.service.TrackerService;
import com.scienta.cs.types.*;
import lombok.RequiredArgsConstructor;

@DgsComponent
@RequiredArgsConstructor
public class TrackerFetcher {

    private final TrackerService trackerService;

    @DgsData(parentType = "RateResponse", field = "tracker")
    public TrackerResponse getPostageLabelByRate(DgsDataFetchingEnvironment dfe) {
        RateResponse source = dfe.getSource();
        String shipmentId = source.getShipment_id();
        return trackerService.getByShipmentId(shipmentId);
    }

    @DgsQuery
    public TrackerResponse getTracker(@InputArgument TrackerGetRequest request) {
        return trackerService.getByCode(request);
    }

}
