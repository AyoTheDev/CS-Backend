package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class InitOrderProjectionRoot extends BaseProjectionNode {
  public InitOrderProjectionRoot id() {
    getFields().put("id", null);
    return this;
  }
}
