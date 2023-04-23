package com.scienta.cs.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class ParcelRequest {
  private MeasurementType measurementType;

  private Double length;

  private Double width;

  private Double height;

  private Double weight;

  public ParcelRequest() {
  }

  public ParcelRequest(MeasurementType measurementType, Double length, Double width, Double height,
      Double weight) {
    this.measurementType = measurementType;
    this.length = length;
    this.width = width;
    this.height = height;
    this.weight = weight;
  }

  public MeasurementType getMeasurementType() {
    return measurementType;
  }

  public void setMeasurementType(MeasurementType measurementType) {
    this.measurementType = measurementType;
  }

  public Double getLength() {
    return length;
  }

  public void setLength(Double length) {
    this.length = length;
  }

  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "ParcelRequest{" + "measurementType='" + measurementType + "'," +"length='" + length + "'," +"width='" + width + "'," +"height='" + height + "'," +"weight='" + weight + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParcelRequest that = (ParcelRequest) o;
        return java.util.Objects.equals(measurementType, that.measurementType) &&
                            java.util.Objects.equals(length, that.length) &&
                            java.util.Objects.equals(width, that.width) &&
                            java.util.Objects.equals(height, that.height) &&
                            java.util.Objects.equals(weight, that.weight);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(measurementType, length, width, height, weight);
  }

  public static com.scienta.cs.types.ParcelRequest.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private MeasurementType measurementType;

    private Double length;

    private Double width;

    private Double height;

    private Double weight;

    public ParcelRequest build() {
                  com.scienta.cs.types.ParcelRequest result = new com.scienta.cs.types.ParcelRequest();
                      result.measurementType = this.measurementType;
          result.length = this.length;
          result.width = this.width;
          result.height = this.height;
          result.weight = this.weight;
                      return result;
    }

    public com.scienta.cs.types.ParcelRequest.Builder measurementType(
        MeasurementType measurementType) {
      this.measurementType = measurementType;
      return this;
    }

    public com.scienta.cs.types.ParcelRequest.Builder length(Double length) {
      this.length = length;
      return this;
    }

    public com.scienta.cs.types.ParcelRequest.Builder width(Double width) {
      this.width = width;
      return this;
    }

    public com.scienta.cs.types.ParcelRequest.Builder height(Double height) {
      this.height = height;
      return this;
    }

    public com.scienta.cs.types.ParcelRequest.Builder weight(Double weight) {
      this.weight = weight;
      return this;
    }
  }
}
