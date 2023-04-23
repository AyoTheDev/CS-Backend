package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.scienta.cs.types.OrderRequest;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class InitOrderGraphQLQuery extends GraphQLQuery {
  public InitOrderGraphQLQuery(OrderRequest request, Set<String> fieldsSet) {
    super("mutation");
    if (request != null || fieldsSet.contains("request")) {
        getInput().put("request", request);
    }
  }

  public InitOrderGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "initOrder";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private OrderRequest request;

    public InitOrderGraphQLQuery build() {
      return new InitOrderGraphQLQuery(request, fieldsSet);
               
    }

    public Builder request(OrderRequest request) {
      this.request = request;
      this.fieldsSet.add("request");
      return this;
    }
  }
}
