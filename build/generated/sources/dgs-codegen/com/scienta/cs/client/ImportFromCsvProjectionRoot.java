package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class ImportFromCsvProjectionRoot extends BaseProjectionNode {
  public ImportFromCsv_RateListProjection rateList() {
    ImportFromCsv_RateListProjection projection = new ImportFromCsv_RateListProjection(this, this);    
    getFields().put("rateList", projection);
    return projection;
  }

  public ImportFromCsv_MessagesProjection messages() {
    ImportFromCsv_MessagesProjection projection = new ImportFromCsv_MessagesProjection(this, this);    
    getFields().put("messages", projection);
    return projection;
  }

  public ImportFromCsvProjectionRoot id() {
    getFields().put("id", null);
    return this;
  }

  public ImportFromCsvProjectionRoot from() {
    getFields().put("from", null);
    return this;
  }

  public ImportFromCsvProjectionRoot to() {
    getFields().put("to", null);
    return this;
  }
}
