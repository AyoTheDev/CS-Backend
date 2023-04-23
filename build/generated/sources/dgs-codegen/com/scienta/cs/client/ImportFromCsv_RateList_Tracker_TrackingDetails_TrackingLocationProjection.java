package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ImportFromCsv_RateList_Tracker_TrackingDetails_TrackingLocationProjection extends BaseSubProjectionNode<ImportFromCsv_RateList_Tracker_TrackingDetailsProjection, ImportFromCsvProjectionRoot> {
  public ImportFromCsv_RateList_Tracker_TrackingDetails_TrackingLocationProjection(
      ImportFromCsv_RateList_Tracker_TrackingDetailsProjection parent,
      ImportFromCsvProjectionRoot root) {
    super(parent, root, java.util.Optional.of("TrackingLocation"));
  }

  public ImportFromCsv_RateList_Tracker_TrackingDetails_TrackingLocationProjection city() {
    getFields().put("city", null);
    return this;
  }

  public ImportFromCsv_RateList_Tracker_TrackingDetails_TrackingLocationProjection state() {
    getFields().put("state", null);
    return this;
  }

  public ImportFromCsv_RateList_Tracker_TrackingDetails_TrackingLocationProjection country() {
    getFields().put("country", null);
    return this;
  }

  public ImportFromCsv_RateList_Tracker_TrackingDetails_TrackingLocationProjection zip() {
    getFields().put("zip", null);
    return this;
  }
}
