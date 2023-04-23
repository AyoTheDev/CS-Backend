package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.scienta.cs.types.OrderEmailRequest;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class SendLabelsToEmailGraphQLQuery extends GraphQLQuery {
  public SendLabelsToEmailGraphQLQuery(OrderEmailRequest request, Set<String> fieldsSet) {
    super("mutation");
    if (request != null || fieldsSet.contains("request")) {
        getInput().put("request", request);
    }
  }

  public SendLabelsToEmailGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "sendLabelsToEmail";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private OrderEmailRequest request;

    public SendLabelsToEmailGraphQLQuery build() {
      return new SendLabelsToEmailGraphQLQuery(request, fieldsSet);
               
    }

    public Builder request(OrderEmailRequest request) {
      this.request = request;
      this.fieldsSet.add("request");
      return this;
    }
  }
}
