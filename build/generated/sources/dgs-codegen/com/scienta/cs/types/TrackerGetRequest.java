package com.scienta.cs.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class TrackerGetRequest {
  private String code;

  public TrackerGetRequest() {
  }

  public TrackerGetRequest(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return "TrackerGetRequest{" + "code='" + code + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrackerGetRequest that = (TrackerGetRequest) o;
        return java.util.Objects.equals(code, that.code);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(code);
  }

  public static com.scienta.cs.types.TrackerGetRequest.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String code;

    public TrackerGetRequest build() {
      com.scienta.cs.types.TrackerGetRequest result = new com.scienta.cs.types.TrackerGetRequest();
          result.code = this.code;
          return result;
    }

    public com.scienta.cs.types.TrackerGetRequest.Builder code(String code) {
      this.code = code;
      return this;
    }
  }
}
