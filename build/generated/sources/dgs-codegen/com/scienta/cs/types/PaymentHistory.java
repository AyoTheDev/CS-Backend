package com.scienta.cs.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class PaymentHistory {
  private long id;

  private Double amount;

  private String currency;

  private String provider;

  private String transaction_type;

  private String created_at;

  private String status;

  public PaymentHistory() {
  }

  public PaymentHistory(long id, Double amount, String currency, String provider,
      String transaction_type, String created_at, String status) {
    this.id = id;
    this.amount = amount;
    this.currency = currency;
    this.provider = provider;
    this.transaction_type = transaction_type;
    this.created_at = created_at;
    this.status = status;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public String getTransaction_type() {
    return transaction_type;
  }

  public void setTransaction_type(String transaction_type) {
    this.transaction_type = transaction_type;
  }

  public String getCreated_at() {
    return created_at;
  }

  public void setCreated_at(String created_at) {
    this.created_at = created_at;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "PaymentHistory{" + "id='" + id + "'," +"amount='" + amount + "'," +"currency='" + currency + "'," +"provider='" + provider + "'," +"transaction_type='" + transaction_type + "'," +"created_at='" + created_at + "'," +"status='" + status + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentHistory that = (PaymentHistory) o;
        return id == that.id &&
                            java.util.Objects.equals(amount, that.amount) &&
                            java.util.Objects.equals(currency, that.currency) &&
                            java.util.Objects.equals(provider, that.provider) &&
                            java.util.Objects.equals(transaction_type, that.transaction_type) &&
                            java.util.Objects.equals(created_at, that.created_at) &&
                            java.util.Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, amount, currency, provider, transaction_type, created_at, status);
  }

  public static com.scienta.cs.types.PaymentHistory.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private long id;

    private Double amount;

    private String currency;

    private String provider;

    private String transaction_type;

    private String created_at;

    private String status;

    public PaymentHistory build() {
                  com.scienta.cs.types.PaymentHistory result = new com.scienta.cs.types.PaymentHistory();
                      result.id = this.id;
          result.amount = this.amount;
          result.currency = this.currency;
          result.provider = this.provider;
          result.transaction_type = this.transaction_type;
          result.created_at = this.created_at;
          result.status = this.status;
                      return result;
    }

    public com.scienta.cs.types.PaymentHistory.Builder id(long id) {
      this.id = id;
      return this;
    }

    public com.scienta.cs.types.PaymentHistory.Builder amount(Double amount) {
      this.amount = amount;
      return this;
    }

    public com.scienta.cs.types.PaymentHistory.Builder currency(String currency) {
      this.currency = currency;
      return this;
    }

    public com.scienta.cs.types.PaymentHistory.Builder provider(String provider) {
      this.provider = provider;
      return this;
    }

    public com.scienta.cs.types.PaymentHistory.Builder transaction_type(String transaction_type) {
      this.transaction_type = transaction_type;
      return this;
    }

    public com.scienta.cs.types.PaymentHistory.Builder created_at(String created_at) {
      this.created_at = created_at;
      return this;
    }

    public com.scienta.cs.types.PaymentHistory.Builder status(String status) {
      this.status = status;
      return this;
    }
  }
}
