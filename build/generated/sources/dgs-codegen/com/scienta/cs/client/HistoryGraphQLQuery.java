package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.scienta.cs.types.TransactionRequest;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class HistoryGraphQLQuery extends GraphQLQuery {
  public HistoryGraphQLQuery(TransactionRequest request, Set<String> fieldsSet) {
    super("query");
    if (request != null || fieldsSet.contains("request")) {
        getInput().put("request", request);
    }
  }

  public HistoryGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "history";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private TransactionRequest request;

    public HistoryGraphQLQuery build() {
      return new HistoryGraphQLQuery(request, fieldsSet);
               
    }

    public Builder request(TransactionRequest request) {
      this.request = request;
      this.fieldsSet.add("request");
      return this;
    }
  }
}
