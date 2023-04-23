package com.scienta.cs.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class OrderRequestInfo {
  private String rateId;

  private String shipmentId;

  public OrderRequestInfo() {
  }

  public OrderRequestInfo(String rateId, String shipmentId) {
    this.rateId = rateId;
    this.shipmentId = shipmentId;
  }

  public String getRateId() {
    return rateId;
  }

  public void setRateId(String rateId) {
    this.rateId = rateId;
  }

  public String getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
  }

  @Override
  public String toString() {
    return "OrderRequestInfo{" + "rateId='" + rateId + "'," +"shipmentId='" + shipmentId + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRequestInfo that = (OrderRequestInfo) o;
        return java.util.Objects.equals(rateId, that.rateId) &&
                            java.util.Objects.equals(shipmentId, that.shipmentId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(rateId, shipmentId);
  }

  public static com.scienta.cs.types.OrderRequestInfo.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String rateId;

    private String shipmentId;

    public OrderRequestInfo build() {
                  com.scienta.cs.types.OrderRequestInfo result = new com.scienta.cs.types.OrderRequestInfo();
                      result.rateId = this.rateId;
          result.shipmentId = this.shipmentId;
                      return result;
    }

    public com.scienta.cs.types.OrderRequestInfo.Builder rateId(String rateId) {
      this.rateId = rateId;
      return this;
    }

    public com.scienta.cs.types.OrderRequestInfo.Builder shipmentId(String shipmentId) {
      this.shipmentId = shipmentId;
      return this;
    }
  }
}
