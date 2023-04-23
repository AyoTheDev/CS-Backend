package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GetTracker_TrackingDetails_TrackingLocationProjection extends BaseSubProjectionNode<GetTracker_TrackingDetailsProjection, GetTrackerProjectionRoot> {
  public GetTracker_TrackingDetails_TrackingLocationProjection(
      GetTracker_TrackingDetailsProjection parent, GetTrackerProjectionRoot root) {
    super(parent, root, java.util.Optional.of("TrackingLocation"));
  }

  public GetTracker_TrackingDetails_TrackingLocationProjection city() {
    getFields().put("city", null);
    return this;
  }

  public GetTracker_TrackingDetails_TrackingLocationProjection state() {
    getFields().put("state", null);
    return this;
  }

  public GetTracker_TrackingDetails_TrackingLocationProjection country() {
    getFields().put("country", null);
    return this;
  }

  public GetTracker_TrackingDetails_TrackingLocationProjection zip() {
    getFields().put("zip", null);
    return this;
  }
}
