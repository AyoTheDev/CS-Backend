package com.scienta.cs.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class OrderEmailRequest {
  private String orderId;

  private String email;

  public OrderEmailRequest() {
  }

  public OrderEmailRequest(String orderId, String email) {
    this.orderId = orderId;
    this.email = email;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "OrderEmailRequest{" + "orderId='" + orderId + "'," +"email='" + email + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderEmailRequest that = (OrderEmailRequest) o;
        return java.util.Objects.equals(orderId, that.orderId) &&
                            java.util.Objects.equals(email, that.email);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(orderId, email);
  }

  public static com.scienta.cs.types.OrderEmailRequest.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String orderId;

    private String email;

    public OrderEmailRequest build() {
                  com.scienta.cs.types.OrderEmailRequest result = new com.scienta.cs.types.OrderEmailRequest();
                      result.orderId = this.orderId;
          result.email = this.email;
                      return result;
    }

    public com.scienta.cs.types.OrderEmailRequest.Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    public com.scienta.cs.types.OrderEmailRequest.Builder email(String email) {
      this.email = email;
      return this;
    }
  }
}
