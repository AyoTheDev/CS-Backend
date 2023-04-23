package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GetOrder_RateList_Tracker_TrackingDetailsProjection extends BaseSubProjectionNode<GetOrder_RateList_TrackerProjection, GetOrderProjectionRoot> {
  public GetOrder_RateList_Tracker_TrackingDetailsProjection(
      GetOrder_RateList_TrackerProjection parent, GetOrderProjectionRoot root) {
    super(parent, root, java.util.Optional.of("TrackingDetailResponse"));
  }

  public GetOrder_RateList_Tracker_TrackingDetails_TrackingLocationProjection trackingLocation() {
     GetOrder_RateList_Tracker_TrackingDetails_TrackingLocationProjection projection = new GetOrder_RateList_Tracker_TrackingDetails_TrackingLocationProjection(this, getRoot());
     getFields().put("trackingLocation", projection);
     return projection;
  }

  public GetOrder_RateList_Tracker_TrackingDetailsProjection message() {
    getFields().put("message", null);
    return this;
  }

  public GetOrder_RateList_Tracker_TrackingDetailsProjection status() {
    getFields().put("status", null);
    return this;
  }

  public GetOrder_RateList_Tracker_TrackingDetailsProjection datetime() {
    getFields().put("datetime", null);
    return this;
  }

  public GetOrder_RateList_Tracker_TrackingDetailsProjection source() {
    getFields().put("source", null);
    return this;
  }
}
