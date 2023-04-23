package com.scienta.cs.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class ShipmentResponse {
  private String id;

  private String from;

  private String to;

  private List<RateResponse> rateList;

  private List<Message> messages;

  public ShipmentResponse() {
  }

  public ShipmentResponse(String id, String from, String to, List<RateResponse> rateList,
      List<Message> messages) {
    this.id = id;
    this.from = from;
    this.to = to;
    this.rateList = rateList;
    this.messages = messages;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public List<RateResponse> getRateList() {
    return rateList;
  }

  public void setRateList(List<RateResponse> rateList) {
    this.rateList = rateList;
  }

  public List<Message> getMessages() {
    return messages;
  }

  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }

  @Override
  public String toString() {
    return "ShipmentResponse{" + "id='" + id + "'," +"from='" + from + "'," +"to='" + to + "'," +"rateList='" + rateList + "'," +"messages='" + messages + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipmentResponse that = (ShipmentResponse) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(from, that.from) &&
                            java.util.Objects.equals(to, that.to) &&
                            java.util.Objects.equals(rateList, that.rateList) &&
                            java.util.Objects.equals(messages, that.messages);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, from, to, rateList, messages);
  }

  public static com.scienta.cs.types.ShipmentResponse.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private String from;

    private String to;

    private List<RateResponse> rateList;

    private List<Message> messages;

    public ShipmentResponse build() {
                  com.scienta.cs.types.ShipmentResponse result = new com.scienta.cs.types.ShipmentResponse();
                      result.id = this.id;
          result.from = this.from;
          result.to = this.to;
          result.rateList = this.rateList;
          result.messages = this.messages;
                      return result;
    }

    public com.scienta.cs.types.ShipmentResponse.Builder id(String id) {
      this.id = id;
      return this;
    }

    public com.scienta.cs.types.ShipmentResponse.Builder from(String from) {
      this.from = from;
      return this;
    }

    public com.scienta.cs.types.ShipmentResponse.Builder to(String to) {
      this.to = to;
      return this;
    }

    public com.scienta.cs.types.ShipmentResponse.Builder rateList(List<RateResponse> rateList) {
      this.rateList = rateList;
      return this;
    }

    public com.scienta.cs.types.ShipmentResponse.Builder messages(List<Message> messages) {
      this.messages = messages;
      return this;
    }
  }
}
