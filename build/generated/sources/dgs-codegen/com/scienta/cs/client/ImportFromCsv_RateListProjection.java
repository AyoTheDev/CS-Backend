package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ImportFromCsv_RateListProjection extends BaseSubProjectionNode<ImportFromCsvProjectionRoot, ImportFromCsvProjectionRoot> {
  public ImportFromCsv_RateListProjection(ImportFromCsvProjectionRoot parent,
      ImportFromCsvProjectionRoot root) {
    super(parent, root, java.util.Optional.of("RateResponse"));
  }

  public ImportFromCsv_RateList_PostageLabelProjection postageLabel() {
     ImportFromCsv_RateList_PostageLabelProjection projection = new ImportFromCsv_RateList_PostageLabelProjection(this, getRoot());
     getFields().put("postageLabel", projection);
     return projection;
  }

  public ImportFromCsv_RateList_TrackerProjection tracker() {
     ImportFromCsv_RateList_TrackerProjection projection = new ImportFromCsv_RateList_TrackerProjection(this, getRoot());
     getFields().put("tracker", projection);
     return projection;
  }

  public ImportFromCsv_RateListProjection id() {
    getFields().put("id", null);
    return this;
  }

  public ImportFromCsv_RateListProjection object() {
    getFields().put("object", null);
    return this;
  }

  public ImportFromCsv_RateListProjection billing_type() {
    getFields().put("billing_type", null);
    return this;
  }

  public ImportFromCsv_RateListProjection carrier_account_id() {
    getFields().put("carrier_account_id", null);
    return this;
  }

  public ImportFromCsv_RateListProjection service() {
    getFields().put("service", null);
    return this;
  }

  public ImportFromCsv_RateListProjection rate() {
    getFields().put("rate", null);
    return this;
  }

  public ImportFromCsv_RateListProjection carrier() {
    getFields().put("carrier", null);
    return this;
  }

  public ImportFromCsv_RateListProjection currency() {
    getFields().put("currency", null);
    return this;
  }

  public ImportFromCsv_RateListProjection description() {
    getFields().put("description", null);
    return this;
  }

  public ImportFromCsv_RateListProjection shipment_id() {
    getFields().put("shipment_id", null);
    return this;
  }

  public ImportFromCsv_RateListProjection delivery_days() {
    getFields().put("delivery_days", null);
    return this;
  }

  public ImportFromCsv_RateListProjection delivery_date() {
    getFields().put("delivery_date", null);
    return this;
  }

  public ImportFromCsv_RateListProjection delivery_date_guaranteed() {
    getFields().put("delivery_date_guaranteed", null);
    return this;
  }

  public ImportFromCsv_RateListProjection status() {
    getFields().put("status", null);
    return this;
  }
}
