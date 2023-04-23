package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.scienta.cs.types.OrderCompleteRequest;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class CompleteOrderGraphQLQuery extends GraphQLQuery {
  public CompleteOrderGraphQLQuery(OrderCompleteRequest request, Set<String> fieldsSet) {
    super("mutation");
    if (request != null || fieldsSet.contains("request")) {
        getInput().put("request", request);
    }
  }

  public CompleteOrderGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "completeOrder";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private OrderCompleteRequest request;

    public CompleteOrderGraphQLQuery build() {
      return new CompleteOrderGraphQLQuery(request, fieldsSet);
               
    }

    public Builder request(OrderCompleteRequest request) {
      this.request = request;
      this.fieldsSet.add("request");
      return this;
    }
  }
}
