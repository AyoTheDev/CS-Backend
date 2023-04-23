package com.scienta.cs.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class TrackingLocation {
  private String city;

  private String state;

  private String country;

  private String zip;

  public TrackingLocation() {
  }

  public TrackingLocation(String city, String state, String country, String zip) {
    this.city = city;
    this.state = state;
    this.country = country;
    this.zip = zip;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public String toString() {
    return "TrackingLocation{" + "city='" + city + "'," +"state='" + state + "'," +"country='" + country + "'," +"zip='" + zip + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrackingLocation that = (TrackingLocation) o;
        return java.util.Objects.equals(city, that.city) &&
                            java.util.Objects.equals(state, that.state) &&
                            java.util.Objects.equals(country, that.country) &&
                            java.util.Objects.equals(zip, that.zip);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(city, state, country, zip);
  }

  public static com.scienta.cs.types.TrackingLocation.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String city;

    private String state;

    private String country;

    private String zip;

    public TrackingLocation build() {
                  com.scienta.cs.types.TrackingLocation result = new com.scienta.cs.types.TrackingLocation();
                      result.city = this.city;
          result.state = this.state;
          result.country = this.country;
          result.zip = this.zip;
                      return result;
    }

    public com.scienta.cs.types.TrackingLocation.Builder city(String city) {
      this.city = city;
      return this;
    }

    public com.scienta.cs.types.TrackingLocation.Builder state(String state) {
      this.state = state;
      return this;
    }

    public com.scienta.cs.types.TrackingLocation.Builder country(String country) {
      this.country = country;
      return this;
    }

    public com.scienta.cs.types.TrackingLocation.Builder zip(String zip) {
      this.zip = zip;
      return this;
    }
  }
}
