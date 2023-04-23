package com.scienta.cs.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InitShipment_RateList_PostageLabelProjection extends BaseSubProjectionNode<InitShipment_RateListProjection, InitShipmentProjectionRoot> {
  public InitShipment_RateList_PostageLabelProjection(InitShipment_RateListProjection parent,
      InitShipmentProjectionRoot root) {
    super(parent, root, java.util.Optional.of("PostageLabelResponse"));
  }

  public InitShipment_RateList_PostageLabelProjection id() {
    getFields().put("id", null);
    return this;
  }

  public InitShipment_RateList_PostageLabelProjection labelDate() {
    getFields().put("labelDate", null);
    return this;
  }

  public InitShipment_RateList_PostageLabelProjection labelEpl2Url() {
    getFields().put("labelEpl2Url", null);
    return this;
  }

  public InitShipment_RateList_PostageLabelProjection labelFileType() {
    getFields().put("labelFileType", null);
    return this;
  }

  public InitShipment_RateList_PostageLabelProjection labelPdfUrl() {
    getFields().put("labelPdfUrl", null);
    return this;
  }

  public InitShipment_RateList_PostageLabelProjection labelResolution() {
    getFields().put("labelResolution", null);
    return this;
  }

  public InitShipment_RateList_PostageLabelProjection labelSize() {
    getFields().put("labelSize", null);
    return this;
  }

  public InitShipment_RateList_PostageLabelProjection labelType() {
    getFields().put("labelType", null);
    return this;
  }

  public InitShipment_RateList_PostageLabelProjection labelUrl() {
    getFields().put("labelUrl", null);
    return this;
  }

  public InitShipment_RateList_PostageLabelProjection labelZplUrl() {
    getFields().put("labelZplUrl", null);
    return this;
  }
}
