package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class GetTrackerProjectionRoot extends BaseProjectionNode {
  public GetTracker_TrackingDetailsProjection trackingDetails() {
    GetTracker_TrackingDetailsProjection projection = new GetTracker_TrackingDetailsProjection(this, this);    
    getFields().put("trackingDetails", projection);
    return projection;
  }

  public GetTrackerProjectionRoot id() {
    getFields().put("id", null);
    return this;
  }

  public GetTrackerProjectionRoot trackingCode() {
    getFields().put("trackingCode", null);
    return this;
  }

  public GetTrackerProjectionRoot status() {
    getFields().put("status", null);
    return this;
  }

  public GetTrackerProjectionRoot signedBy() {
    getFields().put("signedBy", null);
    return this;
  }

  public GetTrackerProjectionRoot weight() {
    getFields().put("weight", null);
    return this;
  }

  public GetTrackerProjectionRoot estDeliveryDate() {
    getFields().put("estDeliveryDate", null);
    return this;
  }

  public GetTrackerProjectionRoot shipmentId() {
    getFields().put("shipmentId", null);
    return this;
  }

  public GetTrackerProjectionRoot carrier() {
    getFields().put("carrier", null);
    return this;
  }

  public GetTrackerProjectionRoot publicUrl() {
    getFields().put("publicUrl", null);
    return this;
  }

  public GetTrackerProjectionRoot fees() {
    getFields().put("fees", null);
    return this;
  }

  public GetTrackerProjectionRoot createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public GetTrackerProjectionRoot updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
