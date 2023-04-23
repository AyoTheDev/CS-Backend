package com.scienta.cs.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Message {
  private String carrier;

  private String type;

  private String message;

  private String carrier_account_id;

  public Message() {
  }

  public Message(String carrier, String type, String message, String carrier_account_id) {
    this.carrier = carrier;
    this.type = type;
    this.message = message;
    this.carrier_account_id = carrier_account_id;
  }

  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getCarrier_account_id() {
    return carrier_account_id;
  }

  public void setCarrier_account_id(String carrier_account_id) {
    this.carrier_account_id = carrier_account_id;
  }

  @Override
  public String toString() {
    return "Message{" + "carrier='" + carrier + "'," +"type='" + type + "'," +"message='" + message + "'," +"carrier_account_id='" + carrier_account_id + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message that = (Message) o;
        return java.util.Objects.equals(carrier, that.carrier) &&
                            java.util.Objects.equals(type, that.type) &&
                            java.util.Objects.equals(message, that.message) &&
                            java.util.Objects.equals(carrier_account_id, that.carrier_account_id);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(carrier, type, message, carrier_account_id);
  }

  public static com.scienta.cs.types.Message.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String carrier;

    private String type;

    private String message;

    private String carrier_account_id;

    public Message build() {
                  com.scienta.cs.types.Message result = new com.scienta.cs.types.Message();
                      result.carrier = this.carrier;
          result.type = this.type;
          result.message = this.message;
          result.carrier_account_id = this.carrier_account_id;
                      return result;
    }

    public com.scienta.cs.types.Message.Builder carrier(String carrier) {
      this.carrier = carrier;
      return this;
    }

    public com.scienta.cs.types.Message.Builder type(String type) {
      this.type = type;
      return this;
    }

    public com.scienta.cs.types.Message.Builder message(String message) {
      this.message = message;
      return this;
    }

    public com.scienta.cs.types.Message.Builder carrier_account_id(String carrier_account_id) {
      this.carrier_account_id = carrier_account_id;
      return this;
    }
  }
}
