package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InitShipment_RateList_Tracker_TrackingDetailsProjection extends BaseSubProjectionNode<InitShipment_RateList_TrackerProjection, InitShipmentProjectionRoot> {
  public InitShipment_RateList_Tracker_TrackingDetailsProjection(
      InitShipment_RateList_TrackerProjection parent, InitShipmentProjectionRoot root) {
    super(parent, root, java.util.Optional.of("TrackingDetailResponse"));
  }

  public InitShipment_RateList_Tracker_TrackingDetails_TrackingLocationProjection trackingLocation(
      ) {
     InitShipment_RateList_Tracker_TrackingDetails_TrackingLocationProjection projection = new InitShipment_RateList_Tracker_TrackingDetails_TrackingLocationProjection(this, getRoot());
     getFields().put("trackingLocation", projection);
     return projection;
  }

  public InitShipment_RateList_Tracker_TrackingDetailsProjection message() {
    getFields().put("message", null);
    return this;
  }

  public InitShipment_RateList_Tracker_TrackingDetailsProjection status() {
    getFields().put("status", null);
    return this;
  }

  public InitShipment_RateList_Tracker_TrackingDetailsProjection datetime() {
    getFields().put("datetime", null);
    return this;
  }

  public InitShipment_RateList_Tracker_TrackingDetailsProjection source() {
    getFields().put("source", null);
    return this;
  }
}
