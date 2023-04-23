package com.scienta.cs.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.scienta.cs.types.OrderGetResponse;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class GetOrderDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "getOrder"
  )
  public OrderGetResponse getGetOrder(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
