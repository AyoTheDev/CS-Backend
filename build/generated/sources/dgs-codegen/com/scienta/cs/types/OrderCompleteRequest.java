package com.scienta.cs.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class OrderCompleteRequest {
  private String orderId;

  public OrderCompleteRequest() {
  }

  public OrderCompleteRequest(String orderId) {
    this.orderId = orderId;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  @Override
  public String toString() {
    return "OrderCompleteRequest{" + "orderId='" + orderId + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderCompleteRequest that = (OrderCompleteRequest) o;
        return java.util.Objects.equals(orderId, that.orderId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(orderId);
  }

  public static com.scienta.cs.types.OrderCompleteRequest.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String orderId;

    public OrderCompleteRequest build() {
      com.scienta.cs.types.OrderCompleteRequest result = new com.scienta.cs.types.OrderCompleteRequest();
          result.orderId = this.orderId;
          return result;
    }

    public com.scienta.cs.types.OrderCompleteRequest.Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }
  }
}
