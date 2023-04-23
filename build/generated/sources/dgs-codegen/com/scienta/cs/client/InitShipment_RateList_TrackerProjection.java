package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InitShipment_RateList_TrackerProjection extends BaseSubProjectionNode<InitShipment_RateListProjection, InitShipmentProjectionRoot> {
  public InitShipment_RateList_TrackerProjection(InitShipment_RateListProjection parent,
      InitShipmentProjectionRoot root) {
    super(parent, root, java.util.Optional.of("TrackerResponse"));
  }

  public InitShipment_RateList_Tracker_TrackingDetailsProjection trackingDetails() {
     InitShipment_RateList_Tracker_TrackingDetailsProjection projection = new InitShipment_RateList_Tracker_TrackingDetailsProjection(this, getRoot());
     getFields().put("trackingDetails", projection);
     return projection;
  }

  public InitShipment_RateList_TrackerProjection id() {
    getFields().put("id", null);
    return this;
  }

  public InitShipment_RateList_TrackerProjection trackingCode() {
    getFields().put("trackingCode", null);
    return this;
  }

  public InitShipment_RateList_TrackerProjection status() {
    getFields().put("status", null);
    return this;
  }

  public InitShipment_RateList_TrackerProjection signedBy() {
    getFields().put("signedBy", null);
    return this;
  }

  public InitShipment_RateList_TrackerProjection weight() {
    getFields().put("weight", null);
    return this;
  }

  public InitShipment_RateList_TrackerProjection estDeliveryDate() {
    getFields().put("estDeliveryDate", null);
    return this;
  }

  public InitShipment_RateList_TrackerProjection shipmentId() {
    getFields().put("shipmentId", null);
    return this;
  }

  public InitShipment_RateList_TrackerProjection carrier() {
    getFields().put("carrier", null);
    return this;
  }

  public InitShipment_RateList_TrackerProjection publicUrl() {
    getFields().put("publicUrl", null);
    return this;
  }

  public InitShipment_RateList_TrackerProjection fees() {
    getFields().put("fees", null);
    return this;
  }

  public InitShipment_RateList_TrackerProjection createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public InitShipment_RateList_TrackerProjection updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
