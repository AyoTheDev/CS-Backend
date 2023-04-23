package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GetOrder_RateListProjection extends BaseSubProjectionNode<GetOrderProjectionRoot, GetOrderProjectionRoot> {
  public GetOrder_RateListProjection(GetOrderProjectionRoot parent, GetOrderProjectionRoot root) {
    super(parent, root, java.util.Optional.of("RateResponse"));
  }

  public GetOrder_RateList_PostageLabelProjection postageLabel() {
     GetOrder_RateList_PostageLabelProjection projection = new GetOrder_RateList_PostageLabelProjection(this, getRoot());
     getFields().put("postageLabel", projection);
     return projection;
  }

  public GetOrder_RateList_TrackerProjection tracker() {
     GetOrder_RateList_TrackerProjection projection = new GetOrder_RateList_TrackerProjection(this, getRoot());
     getFields().put("tracker", projection);
     return projection;
  }

  public GetOrder_RateListProjection id() {
    getFields().put("id", null);
    return this;
  }

  public GetOrder_RateListProjection object() {
    getFields().put("object", null);
    return this;
  }

  public GetOrder_RateListProjection billing_type() {
    getFields().put("billing_type", null);
    return this;
  }

  public GetOrder_RateListProjection carrier_account_id() {
    getFields().put("carrier_account_id", null);
    return this;
  }

  public GetOrder_RateListProjection service() {
    getFields().put("service", null);
    return this;
  }

  public GetOrder_RateListProjection rate() {
    getFields().put("rate", null);
    return this;
  }

  public GetOrder_RateListProjection carrier() {
    getFields().put("carrier", null);
    return this;
  }

  public GetOrder_RateListProjection currency() {
    getFields().put("currency", null);
    return this;
  }

  public GetOrder_RateListProjection description() {
    getFields().put("description", null);
    return this;
  }

  public GetOrder_RateListProjection shipment_id() {
    getFields().put("shipment_id", null);
    return this;
  }

  public GetOrder_RateListProjection delivery_days() {
    getFields().put("delivery_days", null);
    return this;
  }

  public GetOrder_RateListProjection delivery_date() {
    getFields().put("delivery_date", null);
    return this;
  }

  public GetOrder_RateListProjection delivery_date_guaranteed() {
    getFields().put("delivery_date_guaranteed", null);
    return this;
  }

  public GetOrder_RateListProjection status() {
    getFields().put("status", null);
    return this;
  }
}
