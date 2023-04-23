package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class HistoryProjectionRoot extends BaseProjectionNode {
  public HistoryProjectionRoot id() {
    getFields().put("id", null);
    return this;
  }

  public HistoryProjectionRoot amount() {
    getFields().put("amount", null);
    return this;
  }

  public HistoryProjectionRoot currency() {
    getFields().put("currency", null);
    return this;
  }

  public HistoryProjectionRoot provider() {
    getFields().put("provider", null);
    return this;
  }

  public HistoryProjectionRoot transaction_type() {
    getFields().put("transaction_type", null);
    return this;
  }

  public HistoryProjectionRoot created_at() {
    getFields().put("created_at", null);
    return this;
  }

  public HistoryProjectionRoot status() {
    getFields().put("status", null);
    return this;
  }
}
