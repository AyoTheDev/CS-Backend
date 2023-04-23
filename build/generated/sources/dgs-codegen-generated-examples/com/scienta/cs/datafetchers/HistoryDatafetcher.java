package com.scienta.cs.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.scienta.cs.types.PaymentHistory;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;

@DgsComponent
public class HistoryDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "history"
  )
  public List<PaymentHistory> getHistory(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
