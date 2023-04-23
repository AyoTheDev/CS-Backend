package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class CurrencyGraphQLQuery extends GraphQLQuery {
  public CurrencyGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "currency";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    public CurrencyGraphQLQuery build() {
      return new CurrencyGraphQLQuery();                                     
    }
  }
}
