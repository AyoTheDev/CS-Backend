package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.scienta.cs.types.OrderGetRequest;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class GetOrderGraphQLQuery extends GraphQLQuery {
  public GetOrderGraphQLQuery(OrderGetRequest request, Set<String> fieldsSet) {
    super("query");
    if (request != null || fieldsSet.contains("request")) {
        getInput().put("request", request);
    }
  }

  public GetOrderGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "getOrder";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private OrderGetRequest request;

    public GetOrderGraphQLQuery build() {
      return new GetOrderGraphQLQuery(request, fieldsSet);
               
    }

    public Builder request(OrderGetRequest request) {
      this.request = request;
      this.fieldsSet.add("request");
      return this;
    }
  }
}
