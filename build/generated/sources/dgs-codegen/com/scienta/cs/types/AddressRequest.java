package com.scienta.cs.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class AddressRequest {
  private String name;

  private String addressLine1;

  private String addressLine2;

  private String city;

  private String postcode;

  private String country;

  private String phone;

  private String state;

  public AddressRequest() {
  }

  public AddressRequest(String name, String addressLine1, String addressLine2, String city,
      String postcode, String country, String phone, String state) {
    this.name = name;
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.city = city;
    this.postcode = postcode;
    this.country = country;
    this.phone = phone;
    this.state = state;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "AddressRequest{" + "name='" + name + "'," +"addressLine1='" + addressLine1 + "'," +"addressLine2='" + addressLine2 + "'," +"city='" + city + "'," +"postcode='" + postcode + "'," +"country='" + country + "'," +"phone='" + phone + "'," +"state='" + state + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressRequest that = (AddressRequest) o;
        return java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(addressLine1, that.addressLine1) &&
                            java.util.Objects.equals(addressLine2, that.addressLine2) &&
                            java.util.Objects.equals(city, that.city) &&
                            java.util.Objects.equals(postcode, that.postcode) &&
                            java.util.Objects.equals(country, that.country) &&
                            java.util.Objects.equals(phone, that.phone) &&
                            java.util.Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, addressLine1, addressLine2, city, postcode, country, phone, state);
  }

  public static com.scienta.cs.types.AddressRequest.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String name;

    private String addressLine1;

    private String addressLine2;

    private String city;

    private String postcode;

    private String country;

    private String phone;

    private String state;

    public AddressRequest build() {
                  com.scienta.cs.types.AddressRequest result = new com.scienta.cs.types.AddressRequest();
                      result.name = this.name;
          result.addressLine1 = this.addressLine1;
          result.addressLine2 = this.addressLine2;
          result.city = this.city;
          result.postcode = this.postcode;
          result.country = this.country;
          result.phone = this.phone;
          result.state = this.state;
                      return result;
    }

    public com.scienta.cs.types.AddressRequest.Builder name(String name) {
      this.name = name;
      return this;
    }

    public com.scienta.cs.types.AddressRequest.Builder addressLine1(String addressLine1) {
      this.addressLine1 = addressLine1;
      return this;
    }

    public com.scienta.cs.types.AddressRequest.Builder addressLine2(String addressLine2) {
      this.addressLine2 = addressLine2;
      return this;
    }

    public com.scienta.cs.types.AddressRequest.Builder city(String city) {
      this.city = city;
      return this;
    }

    public com.scienta.cs.types.AddressRequest.Builder postcode(String postcode) {
      this.postcode = postcode;
      return this;
    }

    public com.scienta.cs.types.AddressRequest.Builder country(String country) {
      this.country = country;
      return this;
    }

    public com.scienta.cs.types.AddressRequest.Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    public com.scienta.cs.types.AddressRequest.Builder state(String state) {
      this.state = state;
      return this;
    }
  }
}
