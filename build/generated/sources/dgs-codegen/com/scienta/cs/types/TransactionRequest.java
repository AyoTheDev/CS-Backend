package com.scienta.cs.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class TransactionRequest {
  private String userUuid;

  private String fromDate;

  private String toDate;

  private long size;

  private long page;

  public TransactionRequest() {
  }

  public TransactionRequest(String userUuid, String fromDate, String toDate, long size, long page) {
    this.userUuid = userUuid;
    this.fromDate = fromDate;
    this.toDate = toDate;
    this.size = size;
    this.page = page;
  }

  public String getUserUuid() {
    return userUuid;
  }

  public void setUserUuid(String userUuid) {
    this.userUuid = userUuid;
  }

  public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public String getToDate() {
    return toDate;
  }

  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public long getSize() {
    return size;
  }

  public void setSize(long size) {
    this.size = size;
  }

  public long getPage() {
    return page;
  }

  public void setPage(long page) {
    this.page = page;
  }

  @Override
  public String toString() {
    return "TransactionRequest{" + "userUuid='" + userUuid + "'," +"fromDate='" + fromDate + "'," +"toDate='" + toDate + "'," +"size='" + size + "'," +"page='" + page + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionRequest that = (TransactionRequest) o;
        return java.util.Objects.equals(userUuid, that.userUuid) &&
                            java.util.Objects.equals(fromDate, that.fromDate) &&
                            java.util.Objects.equals(toDate, that.toDate) &&
                            size == that.size &&
                            page == that.page;
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(userUuid, fromDate, toDate, size, page);
  }

  public static com.scienta.cs.types.TransactionRequest.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String userUuid;

    private String fromDate;

    private String toDate;

    private long size;

    private long page;

    public TransactionRequest build() {
                  com.scienta.cs.types.TransactionRequest result = new com.scienta.cs.types.TransactionRequest();
                      result.userUuid = this.userUuid;
          result.fromDate = this.fromDate;
          result.toDate = this.toDate;
          result.size = this.size;
          result.page = this.page;
                      return result;
    }

    public com.scienta.cs.types.TransactionRequest.Builder userUuid(String userUuid) {
      this.userUuid = userUuid;
      return this;
    }

    public com.scienta.cs.types.TransactionRequest.Builder fromDate(String fromDate) {
      this.fromDate = fromDate;
      return this;
    }

    public com.scienta.cs.types.TransactionRequest.Builder toDate(String toDate) {
      this.toDate = toDate;
      return this;
    }

    public com.scienta.cs.types.TransactionRequest.Builder size(long size) {
      this.size = size;
      return this;
    }

    public com.scienta.cs.types.TransactionRequest.Builder page(long page) {
      this.page = page;
      return this;
    }
  }
}
