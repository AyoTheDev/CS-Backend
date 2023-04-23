package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.scienta.cs.types.ShipmentRequest;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class InitShipmentGraphQLQuery extends GraphQLQuery {
  public InitShipmentGraphQLQuery(ShipmentRequest request, Set<String> fieldsSet) {
    super("mutation");
    if (request != null || fieldsSet.contains("request")) {
        getInput().put("request", request);
    }
  }

  public InitShipmentGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "initShipment";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ShipmentRequest request;

    public InitShipmentGraphQLQuery build() {
      return new InitShipmentGraphQLQuery(request, fieldsSet);
               
    }

    public Builder request(ShipmentRequest request) {
      this.request = request;
      this.fieldsSet.add("request");
      return this;
    }
  }
}
