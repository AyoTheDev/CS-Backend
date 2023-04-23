package com.scienta.cs.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class OrderGetResponse {
  private List<RateResponse> rateList;

  private String status;

  private String transactionId;

  private String orderId;

  public OrderGetResponse() {
  }

  public OrderGetResponse(List<RateResponse> rateList, String status, String transactionId,
      String orderId) {
    this.rateList = rateList;
    this.status = status;
    this.transactionId = transactionId;
    this.orderId = orderId;
  }

  public List<RateResponse> getRateList() {
    return rateList;
  }

  public void setRateList(List<RateResponse> rateList) {
    this.rateList = rateList;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  @Override
  public String toString() {
    return "OrderGetResponse{" + "rateList='" + rateList + "'," +"status='" + status + "'," +"transactionId='" + transactionId + "'," +"orderId='" + orderId + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderGetResponse that = (OrderGetResponse) o;
        return java.util.Objects.equals(rateList, that.rateList) &&
                            java.util.Objects.equals(status, that.status) &&
                            java.util.Objects.equals(transactionId, that.transactionId) &&
                            java.util.Objects.equals(orderId, that.orderId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(rateList, status, transactionId, orderId);
  }

  public static com.scienta.cs.types.OrderGetResponse.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private List<RateResponse> rateList;

    private String status;

    private String transactionId;

    private String orderId;

    public OrderGetResponse build() {
                  com.scienta.cs.types.OrderGetResponse result = new com.scienta.cs.types.OrderGetResponse();
                      result.rateList = this.rateList;
          result.status = this.status;
          result.transactionId = this.transactionId;
          result.orderId = this.orderId;
                      return result;
    }

    public com.scienta.cs.types.OrderGetResponse.Builder rateList(List<RateResponse> rateList) {
      this.rateList = rateList;
      return this;
    }

    public com.scienta.cs.types.OrderGetResponse.Builder status(String status) {
      this.status = status;
      return this;
    }

    public com.scienta.cs.types.OrderGetResponse.Builder transactionId(String transactionId) {
      this.transactionId = transactionId;
      return this;
    }

    public com.scienta.cs.types.OrderGetResponse.Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }
  }
}
