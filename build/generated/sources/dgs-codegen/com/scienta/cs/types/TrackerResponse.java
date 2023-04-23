package com.scienta.cs.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class TrackerResponse {
  private String id;

  private String trackingCode;

  private String status;

  private String signedBy;

  private Double weight;

  private String estDeliveryDate;

  private String shipmentId;

  private String carrier;

  private List<TrackingDetailResponse> trackingDetails;

  private String publicUrl;

  private String fees;

  private String createdAt;

  private String updatedAt;

  public TrackerResponse() {
  }

  public TrackerResponse(String id, String trackingCode, String status, String signedBy,
      Double weight, String estDeliveryDate, String shipmentId, String carrier,
      List<TrackingDetailResponse> trackingDetails, String publicUrl, String fees, String createdAt,
      String updatedAt) {
    this.id = id;
    this.trackingCode = trackingCode;
    this.status = status;
    this.signedBy = signedBy;
    this.weight = weight;
    this.estDeliveryDate = estDeliveryDate;
    this.shipmentId = shipmentId;
    this.carrier = carrier;
    this.trackingDetails = trackingDetails;
    this.publicUrl = publicUrl;
    this.fees = fees;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTrackingCode() {
    return trackingCode;
  }

  public void setTrackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getSignedBy() {
    return signedBy;
  }

  public void setSignedBy(String signedBy) {
    this.signedBy = signedBy;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public String getEstDeliveryDate() {
    return estDeliveryDate;
  }

  public void setEstDeliveryDate(String estDeliveryDate) {
    this.estDeliveryDate = estDeliveryDate;
  }

  public String getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
  }

  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public List<TrackingDetailResponse> getTrackingDetails() {
    return trackingDetails;
  }

  public void setTrackingDetails(List<TrackingDetailResponse> trackingDetails) {
    this.trackingDetails = trackingDetails;
  }

  public String getPublicUrl() {
    return publicUrl;
  }

  public void setPublicUrl(String publicUrl) {
    this.publicUrl = publicUrl;
  }

  public String getFees() {
    return fees;
  }

  public void setFees(String fees) {
    this.fees = fees;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "TrackerResponse{" + "id='" + id + "'," +"trackingCode='" + trackingCode + "'," +"status='" + status + "'," +"signedBy='" + signedBy + "'," +"weight='" + weight + "'," +"estDeliveryDate='" + estDeliveryDate + "'," +"shipmentId='" + shipmentId + "'," +"carrier='" + carrier + "'," +"trackingDetails='" + trackingDetails + "'," +"publicUrl='" + publicUrl + "'," +"fees='" + fees + "'," +"createdAt='" + createdAt + "'," +"updatedAt='" + updatedAt + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrackerResponse that = (TrackerResponse) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(trackingCode, that.trackingCode) &&
                            java.util.Objects.equals(status, that.status) &&
                            java.util.Objects.equals(signedBy, that.signedBy) &&
                            java.util.Objects.equals(weight, that.weight) &&
                            java.util.Objects.equals(estDeliveryDate, that.estDeliveryDate) &&
                            java.util.Objects.equals(shipmentId, that.shipmentId) &&
                            java.util.Objects.equals(carrier, that.carrier) &&
                            java.util.Objects.equals(trackingDetails, that.trackingDetails) &&
                            java.util.Objects.equals(publicUrl, that.publicUrl) &&
                            java.util.Objects.equals(fees, that.fees) &&
                            java.util.Objects.equals(createdAt, that.createdAt) &&
                            java.util.Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, trackingCode, status, signedBy, weight, estDeliveryDate, shipmentId, carrier, trackingDetails, publicUrl, fees, createdAt, updatedAt);
  }

  public static com.scienta.cs.types.TrackerResponse.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private String trackingCode;

    private String status;

    private String signedBy;

    private Double weight;

    private String estDeliveryDate;

    private String shipmentId;

    private String carrier;

    private List<TrackingDetailResponse> trackingDetails;

    private String publicUrl;

    private String fees;

    private String createdAt;

    private String updatedAt;

    public TrackerResponse build() {
                  com.scienta.cs.types.TrackerResponse result = new com.scienta.cs.types.TrackerResponse();
                      result.id = this.id;
          result.trackingCode = this.trackingCode;
          result.status = this.status;
          result.signedBy = this.signedBy;
          result.weight = this.weight;
          result.estDeliveryDate = this.estDeliveryDate;
          result.shipmentId = this.shipmentId;
          result.carrier = this.carrier;
          result.trackingDetails = this.trackingDetails;
          result.publicUrl = this.publicUrl;
          result.fees = this.fees;
          result.createdAt = this.createdAt;
          result.updatedAt = this.updatedAt;
                      return result;
    }

    public com.scienta.cs.types.TrackerResponse.Builder id(String id) {
      this.id = id;
      return this;
    }

    public com.scienta.cs.types.TrackerResponse.Builder trackingCode(String trackingCode) {
      this.trackingCode = trackingCode;
      return this;
    }

    public com.scienta.cs.types.TrackerResponse.Builder status(String status) {
      this.status = status;
      return this;
    }

    public com.scienta.cs.types.TrackerResponse.Builder signedBy(String signedBy) {
      this.signedBy = signedBy;
      return this;
    }

    public com.scienta.cs.types.TrackerResponse.Builder weight(Double weight) {
      this.weight = weight;
      return this;
    }

    public com.scienta.cs.types.TrackerResponse.Builder estDeliveryDate(String estDeliveryDate) {
      this.estDeliveryDate = estDeliveryDate;
      return this;
    }

    public com.scienta.cs.types.TrackerResponse.Builder shipmentId(String shipmentId) {
      this.shipmentId = shipmentId;
      return this;
    }

    public com.scienta.cs.types.TrackerResponse.Builder carrier(String carrier) {
      this.carrier = carrier;
      return this;
    }

    public com.scienta.cs.types.TrackerResponse.Builder trackingDetails(
        List<TrackingDetailResponse> trackingDetails) {
      this.trackingDetails = trackingDetails;
      return this;
    }

    public com.scienta.cs.types.TrackerResponse.Builder publicUrl(String publicUrl) {
      this.publicUrl = publicUrl;
      return this;
    }

    public com.scienta.cs.types.TrackerResponse.Builder fees(String fees) {
      this.fees = fees;
      return this;
    }

    public com.scienta.cs.types.TrackerResponse.Builder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public com.scienta.cs.types.TrackerResponse.Builder updatedAt(String updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
