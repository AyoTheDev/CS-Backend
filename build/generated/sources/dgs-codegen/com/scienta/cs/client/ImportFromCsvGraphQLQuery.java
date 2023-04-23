package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.netflix.graphql.dgs.scalars.UploadScalar;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class ImportFromCsvGraphQLQuery extends GraphQLQuery {
  public ImportFromCsvGraphQLQuery(UploadScalar file, Set<String> fieldsSet) {
    super("mutation");
    if (file != null || fieldsSet.contains("file")) {
        getInput().put("file", file);
    }
  }

  public ImportFromCsvGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "importFromCsv";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private UploadScalar file;

    public ImportFromCsvGraphQLQuery build() {
      return new ImportFromCsvGraphQLQuery(file, fieldsSet);
               
    }

    public Builder file(UploadScalar file) {
      this.file = file;
      this.fieldsSet.add("file");
      return this;
    }
  }
}
