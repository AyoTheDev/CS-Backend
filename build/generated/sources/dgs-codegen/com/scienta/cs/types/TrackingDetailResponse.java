package com.scienta.cs.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class TrackingDetailResponse {
  private String message;

  private String status;

  private String datetime;

  private String source;

  private TrackingLocation trackingLocation;

  public TrackingDetailResponse() {
  }

  public TrackingDetailResponse(String message, String status, String datetime, String source,
      TrackingLocation trackingLocation) {
    this.message = message;
    this.status = status;
    this.datetime = datetime;
    this.source = source;
    this.trackingLocation = trackingLocation;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public TrackingLocation getTrackingLocation() {
    return trackingLocation;
  }

  public void setTrackingLocation(TrackingLocation trackingLocation) {
    this.trackingLocation = trackingLocation;
  }

  @Override
  public String toString() {
    return "TrackingDetailResponse{" + "message='" + message + "'," +"status='" + status + "'," +"datetime='" + datetime + "'," +"source='" + source + "'," +"trackingLocation='" + trackingLocation + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrackingDetailResponse that = (TrackingDetailResponse) o;
        return java.util.Objects.equals(message, that.message) &&
                            java.util.Objects.equals(status, that.status) &&
                            java.util.Objects.equals(datetime, that.datetime) &&
                            java.util.Objects.equals(source, that.source) &&
                            java.util.Objects.equals(trackingLocation, that.trackingLocation);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(message, status, datetime, source, trackingLocation);
  }

  public static com.scienta.cs.types.TrackingDetailResponse.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String message;

    private String status;

    private String datetime;

    private String source;

    private TrackingLocation trackingLocation;

    public TrackingDetailResponse build() {
                  com.scienta.cs.types.TrackingDetailResponse result = new com.scienta.cs.types.TrackingDetailResponse();
                      result.message = this.message;
          result.status = this.status;
          result.datetime = this.datetime;
          result.source = this.source;
          result.trackingLocation = this.trackingLocation;
                      return result;
    }

    public com.scienta.cs.types.TrackingDetailResponse.Builder message(String message) {
      this.message = message;
      return this;
    }

    public com.scienta.cs.types.TrackingDetailResponse.Builder status(String status) {
      this.status = status;
      return this;
    }

    public com.scienta.cs.types.TrackingDetailResponse.Builder datetime(String datetime) {
      this.datetime = datetime;
      return this;
    }

    public com.scienta.cs.types.TrackingDetailResponse.Builder source(String source) {
      this.source = source;
      return this;
    }

    public com.scienta.cs.types.TrackingDetailResponse.Builder trackingLocation(
        TrackingLocation trackingLocation) {
      this.trackingLocation = trackingLocation;
      return this;
    }
  }
}
