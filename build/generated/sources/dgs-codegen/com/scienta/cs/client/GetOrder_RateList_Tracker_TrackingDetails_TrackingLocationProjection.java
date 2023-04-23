package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GetOrder_RateList_Tracker_TrackingDetails_TrackingLocationProjection extends BaseSubProjectionNode<GetOrder_RateList_Tracker_TrackingDetailsProjection, GetOrderProjectionRoot> {
  public GetOrder_RateList_Tracker_TrackingDetails_TrackingLocationProjection(
      GetOrder_RateList_Tracker_TrackingDetailsProjection parent, GetOrderProjectionRoot root) {
    super(parent, root, java.util.Optional.of("TrackingLocation"));
  }

  public GetOrder_RateList_Tracker_TrackingDetails_TrackingLocationProjection city() {
    getFields().put("city", null);
    return this;
  }

  public GetOrder_RateList_Tracker_TrackingDetails_TrackingLocationProjection state() {
    getFields().put("state", null);
    return this;
  }

  public GetOrder_RateList_Tracker_TrackingDetails_TrackingLocationProjection country() {
    getFields().put("country", null);
    return this;
  }

  public GetOrder_RateList_Tracker_TrackingDetails_TrackingLocationProjection zip() {
    getFields().put("zip", null);
    return this;
  }
}
