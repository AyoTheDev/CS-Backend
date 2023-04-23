package com.scienta.cs.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class OrderCompleteResponse {
  private String invoice_url;

  public OrderCompleteResponse() {
  }

  public OrderCompleteResponse(String invoice_url) {
    this.invoice_url = invoice_url;
  }

  public String getInvoice_url() {
    return invoice_url;
  }

  public void setInvoice_url(String invoice_url) {
    this.invoice_url = invoice_url;
  }

  @Override
  public String toString() {
    return "OrderCompleteResponse{" + "invoice_url='" + invoice_url + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderCompleteResponse that = (OrderCompleteResponse) o;
        return java.util.Objects.equals(invoice_url, that.invoice_url);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(invoice_url);
  }

  public static com.scienta.cs.types.OrderCompleteResponse.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String invoice_url;

    public OrderCompleteResponse build() {
      com.scienta.cs.types.OrderCompleteResponse result = new com.scienta.cs.types.OrderCompleteResponse();
          result.invoice_url = this.invoice_url;
          return result;
    }

    public com.scienta.cs.types.OrderCompleteResponse.Builder invoice_url(String invoice_url) {
      this.invoice_url = invoice_url;
      return this;
    }
  }
}
