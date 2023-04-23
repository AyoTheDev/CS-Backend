package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GetTracker_TrackingDetailsProjection extends BaseSubProjectionNode<GetTrackerProjectionRoot, GetTrackerProjectionRoot> {
  public GetTracker_TrackingDetailsProjection(GetTrackerProjectionRoot parent,
      GetTrackerProjectionRoot root) {
    super(parent, root, java.util.Optional.of("TrackingDetailResponse"));
  }

  public GetTracker_TrackingDetails_TrackingLocationProjection trackingLocation() {
     GetTracker_TrackingDetails_TrackingLocationProjection projection = new GetTracker_TrackingDetails_TrackingLocationProjection(this, getRoot());
     getFields().put("trackingLocation", projection);
     return projection;
  }

  public GetTracker_TrackingDetailsProjection message() {
    getFields().put("message", null);
    return this;
  }

  public GetTracker_TrackingDetailsProjection status() {
    getFields().put("status", null);
    return this;
  }

  public GetTracker_TrackingDetailsProjection datetime() {
    getFields().put("datetime", null);
    return this;
  }

  public GetTracker_TrackingDetailsProjection source() {
    getFields().put("source", null);
    return this;
  }
}
