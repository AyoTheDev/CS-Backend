package com.scienta.cs.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class OrderGetRequest {
  private String orderId;

  public OrderGetRequest() {
  }

  public OrderGetRequest(String orderId) {
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
    return "OrderGetRequest{" + "orderId='" + orderId + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderGetRequest that = (OrderGetRequest) o;
        return java.util.Objects.equals(orderId, that.orderId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(orderId);
  }

  public static com.scienta.cs.types.OrderGetRequest.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String orderId;

    public OrderGetRequest build() {
      com.scienta.cs.types.OrderGetRequest result = new com.scienta.cs.types.OrderGetRequest();
          result.orderId = this.orderId;
          return result;
    }

    public com.scienta.cs.types.OrderGetRequest.Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }
  }
}
