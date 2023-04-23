package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ImportFromCsv_MessagesProjection extends BaseSubProjectionNode<ImportFromCsvProjectionRoot, ImportFromCsvProjectionRoot> {
  public ImportFromCsv_MessagesProjection(ImportFromCsvProjectionRoot parent,
      ImportFromCsvProjectionRoot root) {
    super(parent, root, java.util.Optional.of("Message"));
  }

  public ImportFromCsv_MessagesProjection carrier() {
    getFields().put("carrier", null);
    return this;
  }

  public ImportFromCsv_MessagesProjection type() {
    getFields().put("type", null);
    return this;
  }

  public ImportFromCsv_MessagesProjection message() {
    getFields().put("message", null);
    return this;
  }

  public ImportFromCsv_MessagesProjection carrier_account_id() {
    getFields().put("carrier_account_id", null);
    return this;
  }
}
