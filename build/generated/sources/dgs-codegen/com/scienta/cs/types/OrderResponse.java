package com.scienta.cs.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class OrderResponse {
  private String id;

  public OrderResponse() {
  }

  public OrderResponse(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "OrderResponse{" + "id='" + id + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderResponse that = (OrderResponse) o;
        return java.util.Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id);
  }

  public static com.scienta.cs.types.OrderResponse.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    public OrderResponse build() {
      com.scienta.cs.types.OrderResponse result = new com.scienta.cs.types.OrderResponse();
          result.id = this.id;
          return result;
    }

    public com.scienta.cs.types.OrderResponse.Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
