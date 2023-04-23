package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class InitShipmentProjectionRoot extends BaseProjectionNode {
  public InitShipment_RateListProjection rateList() {
    InitShipment_RateListProjection projection = new InitShipment_RateListProjection(this, this);    
    getFields().put("rateList", projection);
    return projection;
  }

  public InitShipment_MessagesProjection messages() {
    InitShipment_MessagesProjection projection = new InitShipment_MessagesProjection(this, this);    
    getFields().put("messages", projection);
    return projection;
  }

  public InitShipmentProjectionRoot id() {
    getFields().put("id", null);
    return this;
  }

  public InitShipmentProjectionRoot from() {
    getFields().put("from", null);
    return this;
  }

  public InitShipmentProjectionRoot to() {
    getFields().put("to", null);
    return this;
  }
}
