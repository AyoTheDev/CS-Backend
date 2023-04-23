package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ImportFromCsv_RateList_TrackerProjection extends BaseSubProjectionNode<ImportFromCsv_RateListProjection, ImportFromCsvProjectionRoot> {
  public ImportFromCsv_RateList_TrackerProjection(ImportFromCsv_RateListProjection parent,
      ImportFromCsvProjectionRoot root) {
    super(parent, root, java.util.Optional.of("TrackerResponse"));
  }

  public ImportFromCsv_RateList_Tracker_TrackingDetailsProjection trackingDetails() {
     ImportFromCsv_RateList_Tracker_TrackingDetailsProjection projection = new ImportFromCsv_RateList_Tracker_TrackingDetailsProjection(this, getRoot());
     getFields().put("trackingDetails", projection);
     return projection;
  }

  public ImportFromCsv_RateList_TrackerProjection id() {
    getFields().put("id", null);
    return this;
  }

  public ImportFromCsv_RateList_TrackerProjection trackingCode() {
    getFields().put("trackingCode", null);
    return this;
  }

  public ImportFromCsv_RateList_TrackerProjection status() {
    getFields().put("status", null);
    return this;
  }

  public ImportFromCsv_RateList_TrackerProjection signedBy() {
    getFields().put("signedBy", null);
    return this;
  }

  public ImportFromCsv_RateList_TrackerProjection weight() {
    getFields().put("weight", null);
    return this;
  }

  public ImportFromCsv_RateList_TrackerProjection estDeliveryDate() {
    getFields().put("estDeliveryDate", null);
    return this;
  }

  public ImportFromCsv_RateList_TrackerProjection shipmentId() {
    getFields().put("shipmentId", null);
    return this;
  }

  public ImportFromCsv_RateList_TrackerProjection carrier() {
    getFields().put("carrier", null);
    return this;
  }

  public ImportFromCsv_RateList_TrackerProjection publicUrl() {
    getFields().put("publicUrl", null);
    return this;
  }

  public ImportFromCsv_RateList_TrackerProjection fees() {
    getFields().put("fees", null);
    return this;
  }

  public ImportFromCsv_RateList_TrackerProjection createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ImportFromCsv_RateList_TrackerProjection updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
