package com.scienta.cs.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.scienta.cs.types.TrackerResponse;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class GetTrackerDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "getTracker"
  )
  public TrackerResponse getGetTracker(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
