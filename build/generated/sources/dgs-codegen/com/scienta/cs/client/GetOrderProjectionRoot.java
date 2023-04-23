package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class GetOrderProjectionRoot extends BaseProjectionNode {
  public GetOrder_RateListProjection rateList() {
    GetOrder_RateListProjection projection = new GetOrder_RateListProjection(this, this);    
    getFields().put("rateList", projection);
    return projection;
  }

  public GetOrderProjectionRoot status() {
    getFields().put("status", null);
    return this;
  }

  public GetOrderProjectionRoot transactionId() {
    getFields().put("transactionId", null);
    return this;
  }

  public GetOrderProjectionRoot orderId() {
    getFields().put("orderId", null);
    return this;
  }
}
