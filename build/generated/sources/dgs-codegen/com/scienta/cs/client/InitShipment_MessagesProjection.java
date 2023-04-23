package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InitShipment_MessagesProjection extends BaseSubProjectionNode<InitShipmentProjectionRoot, InitShipmentProjectionRoot> {
  public InitShipment_MessagesProjection(InitShipmentProjectionRoot parent,
      InitShipmentProjectionRoot root) {
    super(parent, root, java.util.Optional.of("Message"));
  }

  public InitShipment_MessagesProjection carrier() {
    getFields().put("carrier", null);
    return this;
  }

  public InitShipment_MessagesProjection type() {
    getFields().put("type", null);
    return this;
  }

  public InitShipment_MessagesProjection message() {
    getFields().put("message", null);
    return this;
  }

  public InitShipment_MessagesProjection carrier_account_id() {
    getFields().put("carrier_account_id", null);
    return this;
  }
}
