package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class CompleteOrderProjectionRoot extends BaseProjectionNode {
  public CompleteOrderProjectionRoot invoice_url() {
    getFields().put("invoice_url", null);
    return this;
  }
}
