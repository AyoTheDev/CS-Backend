package com.scienta.cs.types;

import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class RateResponse {
  private String id;

  private String object;

  private String billing_type;

  private String carrier_account_id;

  private String service;

  private Double rate;

  private String carrier;

  private String currency;

  private String description;

  private String shipment_id;

  private Integer delivery_days;

  private String delivery_date;

  private Boolean delivery_date_guaranteed;

  private PostageLabelResponse postageLabel;

  private String status;

  private TrackerResponse tracker;

  public RateResponse() {
  }

  public RateResponse(String id, String object, String billing_type, String carrier_account_id,
      String service, Double rate, String carrier, String currency, String description,
      String shipment_id, Integer delivery_days, String delivery_date,
      Boolean delivery_date_guaranteed, PostageLabelResponse postageLabel, String status,
      TrackerResponse tracker) {
    this.id = id;
    this.object = object;
    this.billing_type = billing_type;
    this.carrier_account_id = carrier_account_id;
    this.service = service;
    this.rate = rate;
    this.carrier = carrier;
    this.currency = currency;
    this.description = description;
    this.shipment_id = shipment_id;
    this.delivery_days = delivery_days;
    this.delivery_date = delivery_date;
    this.delivery_date_guaranteed = delivery_date_guaranteed;
    this.postageLabel = postageLabel;
    this.status = status;
    this.tracker = tracker;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public String getBilling_type() {
    return billing_type;
  }

  public void setBilling_type(String billing_type) {
    this.billing_type = billing_type;
  }

  public String getCarrier_account_id() {
    return carrier_account_id;
  }

  public void setCarrier_account_id(String carrier_account_id) {
    this.carrier_account_id = carrier_account_id;
  }

  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getShipment_id() {
    return shipment_id;
  }

  public void setShipment_id(String shipment_id) {
    this.shipment_id = shipment_id;
  }

  public Integer getDelivery_days() {
    return delivery_days;
  }

  public void setDelivery_days(Integer delivery_days) {
    this.delivery_days = delivery_days;
  }

  public String getDelivery_date() {
    return delivery_date;
  }

  public void setDelivery_date(String delivery_date) {
    this.delivery_date = delivery_date;
  }

  public Boolean getDelivery_date_guaranteed() {
    return delivery_date_guaranteed;
  }

  public void setDelivery_date_guaranteed(Boolean delivery_date_guaranteed) {
    this.delivery_date_guaranteed = delivery_date_guaranteed;
  }

  public PostageLabelResponse getPostageLabel() {
    return postageLabel;
  }

  public void setPostageLabel(PostageLabelResponse postageLabel) {
    this.postageLabel = postageLabel;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TrackerResponse getTracker() {
    return tracker;
  }

  public void setTracker(TrackerResponse tracker) {
    this.tracker = tracker;
  }

  @Override
  public String toString() {
    return "RateResponse{" + "id='" + id + "'," +"object='" + object + "'," +"billing_type='" + billing_type + "'," +"carrier_account_id='" + carrier_account_id + "'," +"service='" + service + "'," +"rate='" + rate + "'," +"carrier='" + carrier + "'," +"currency='" + currency + "'," +"description='" + description + "'," +"shipment_id='" + shipment_id + "'," +"delivery_days='" + delivery_days + "'," +"delivery_date='" + delivery_date + "'," +"delivery_date_guaranteed='" + delivery_date_guaranteed + "'," +"postageLabel='" + postageLabel + "'," +"status='" + status + "'," +"tracker='" + tracker + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RateResponse that = (RateResponse) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(object, that.object) &&
                            java.util.Objects.equals(billing_type, that.billing_type) &&
                            java.util.Objects.equals(carrier_account_id, that.carrier_account_id) &&
                            java.util.Objects.equals(service, that.service) &&
                            java.util.Objects.equals(rate, that.rate) &&
                            java.util.Objects.equals(carrier, that.carrier) &&
                            java.util.Objects.equals(currency, that.currency) &&
                            java.util.Objects.equals(description, that.description) &&
                            java.util.Objects.equals(shipment_id, that.shipment_id) &&
                            java.util.Objects.equals(delivery_days, that.delivery_days) &&
                            java.util.Objects.equals(delivery_date, that.delivery_date) &&
                            java.util.Objects.equals(delivery_date_guaranteed, that.delivery_date_guaranteed) &&
                            java.util.Objects.equals(postageLabel, that.postageLabel) &&
                            java.util.Objects.equals(status, that.status) &&
                            java.util.Objects.equals(tracker, that.tracker);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, object, billing_type, carrier_account_id, service, rate, carrier, currency, description, shipment_id, delivery_days, delivery_date, delivery_date_guaranteed, postageLabel, status, tracker);
  }

  public static com.scienta.cs.types.RateResponse.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private String object;

    private String billing_type;

    private String carrier_account_id;

    private String service;

    private Double rate;

    private String carrier;

    private String currency;

    private String description;

    private String shipment_id;

    private Integer delivery_days;

    private String delivery_date;

    private Boolean delivery_date_guaranteed;

    private PostageLabelResponse postageLabel;

    private String status;

    private TrackerResponse tracker;

    public RateResponse build() {
                  com.scienta.cs.types.RateResponse result = new com.scienta.cs.types.RateResponse();
                      result.id = this.id;
          result.object = this.object;
          result.billing_type = this.billing_type;
          result.carrier_account_id = this.carrier_account_id;
          result.service = this.service;
          result.rate = this.rate;
          result.carrier = this.carrier;
          result.currency = this.currency;
          result.description = this.description;
          result.shipment_id = this.shipment_id;
          result.delivery_days = this.delivery_days;
          result.delivery_date = this.delivery_date;
          result.delivery_date_guaranteed = this.delivery_date_guaranteed;
          result.postageLabel = this.postageLabel;
          result.status = this.status;
          result.tracker = this.tracker;
                      return result;
    }

    public com.scienta.cs.types.RateResponse.Builder id(String id) {
      this.id = id;
      return this;
    }

    public com.scienta.cs.types.RateResponse.Builder object(String object) {
      this.object = object;
      return this;
    }

    public com.scienta.cs.types.RateResponse.Builder billing_type(String billing_type) {
      this.billing_type = billing_type;
      return this;
    }

    public com.scienta.cs.types.RateResponse.Builder carrier_account_id(String carrier_account_id) {
      this.carrier_account_id = carrier_account_id;
      return this;
    }

    public com.scienta.cs.types.RateResponse.Builder service(String service) {
      this.service = service;
      return this;
    }

    public com.scienta.cs.types.RateResponse.Builder rate(Double rate) {
      this.rate = rate;
      return this;
    }

    public com.scienta.cs.types.RateResponse.Builder carrier(String carrier) {
      this.carrier = carrier;
      return this;
    }

    public com.scienta.cs.types.RateResponse.Builder currency(String currency) {
      this.currency = currency;
      return this;
    }

    public com.scienta.cs.types.RateResponse.Builder description(String description) {
      this.description = description;
      return this;
    }

    public com.scienta.cs.types.RateResponse.Builder shipment_id(String shipment_id) {
      this.shipment_id = shipment_id;
      return this;
    }

    public com.scienta.cs.types.RateResponse.Builder delivery_days(Integer delivery_days) {
      this.delivery_days = delivery_days;
      return this;
    }

    public com.scienta.cs.types.RateResponse.Builder delivery_date(String delivery_date) {
      this.delivery_date = delivery_date;
      return this;
    }

    public com.scienta.cs.types.RateResponse.Builder delivery_date_guaranteed(
        Boolean delivery_date_guaranteed) {
      this.delivery_date_guaranteed = delivery_date_guaranteed;
      return this;
    }

    public com.scienta.cs.types.RateResponse.Builder postageLabel(
        PostageLabelResponse postageLabel) {
      this.postageLabel = postageLabel;
      return this;
    }

    public com.scienta.cs.types.RateResponse.Builder status(String status) {
      this.status = status;
      return this;
    }

    public com.scienta.cs.types.RateResponse.Builder tracker(TrackerResponse tracker) {
      this.tracker = tracker;
      return this;
    }
  }
}
