package com.scienta.cs.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class OrderRequest {
  private List<OrderRequestInfo> orderList;

  public OrderRequest() {
  }

  public OrderRequest(List<OrderRequestInfo> orderList) {
    this.orderList = orderList;
  }

  public List<OrderRequestInfo> getOrderList() {
    return orderList;
  }

  public void setOrderList(List<OrderRequestInfo> orderList) {
    this.orderList = orderList;
  }

  @Override
  public String toString() {
    return "OrderRequest{" + "orderList='" + orderList + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRequest that = (OrderRequest) o;
        return java.util.Objects.equals(orderList, that.orderList);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(orderList);
  }

  public static com.scienta.cs.types.OrderRequest.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private List<OrderRequestInfo> orderList;

    public OrderRequest build() {
      com.scienta.cs.types.OrderRequest result = new com.scienta.cs.types.OrderRequest();
          result.orderList = this.orderList;
          return result;
    }

    public com.scienta.cs.types.OrderRequest.Builder orderList(List<OrderRequestInfo> orderList) {
      this.orderList = orderList;
      return this;
    }
  }
}
