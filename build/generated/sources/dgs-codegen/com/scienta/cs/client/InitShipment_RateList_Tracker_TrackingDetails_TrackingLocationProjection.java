package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InitShipment_RateList_Tracker_TrackingDetails_TrackingLocationProjection extends BaseSubProjectionNode<InitShipment_RateList_Tracker_TrackingDetailsProjection, InitShipmentProjectionRoot> {
  public InitShipment_RateList_Tracker_TrackingDetails_TrackingLocationProjection(
      InitShipment_RateList_Tracker_TrackingDetailsProjection parent,
      InitShipmentProjectionRoot root) {
    super(parent, root, java.util.Optional.of("TrackingLocation"));
  }

  public InitShipment_RateList_Tracker_TrackingDetails_TrackingLocationProjection city() {
    getFields().put("city", null);
    return this;
  }

  public InitShipment_RateList_Tracker_TrackingDetails_TrackingLocationProjection state() {
    getFields().put("state", null);
    return this;
  }

  public InitShipment_RateList_Tracker_TrackingDetails_TrackingLocationProjection country() {
    getFields().put("country", null);
    return this;
  }

  public InitShipment_RateList_Tracker_TrackingDetails_TrackingLocationProjection zip() {
    getFields().put("zip", null);
    return this;
  }
}
