package com.scienta.cs.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.scienta.cs.types.CurrencyResponse;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;

@DgsComponent
public class CurrencyDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "currency"
  )
  public List<CurrencyResponse> getCurrency(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
