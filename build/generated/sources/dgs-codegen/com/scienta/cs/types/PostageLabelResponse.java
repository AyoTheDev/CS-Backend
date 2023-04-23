package com.scienta.cs.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class PostageLabelResponse {
  private String id;

  private String labelDate;

  private String labelEpl2Url;

  private String labelFileType;

  private String labelPdfUrl;

  private Integer labelResolution;

  private String labelSize;

  private String labelType;

  private String labelUrl;

  private String labelZplUrl;

  public PostageLabelResponse() {
  }

  public PostageLabelResponse(String id, String labelDate, String labelEpl2Url,
      String labelFileType, String labelPdfUrl, Integer labelResolution, String labelSize,
      String labelType, String labelUrl, String labelZplUrl) {
    this.id = id;
    this.labelDate = labelDate;
    this.labelEpl2Url = labelEpl2Url;
    this.labelFileType = labelFileType;
    this.labelPdfUrl = labelPdfUrl;
    this.labelResolution = labelResolution;
    this.labelSize = labelSize;
    this.labelType = labelType;
    this.labelUrl = labelUrl;
    this.labelZplUrl = labelZplUrl;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLabelDate() {
    return labelDate;
  }

  public void setLabelDate(String labelDate) {
    this.labelDate = labelDate;
  }

  public String getLabelEpl2Url() {
    return labelEpl2Url;
  }

  public void setLabelEpl2Url(String labelEpl2Url) {
    this.labelEpl2Url = labelEpl2Url;
  }

  public String getLabelFileType() {
    return labelFileType;
  }

  public void setLabelFileType(String labelFileType) {
    this.labelFileType = labelFileType;
  }

  public String getLabelPdfUrl() {
    return labelPdfUrl;
  }

  public void setLabelPdfUrl(String labelPdfUrl) {
    this.labelPdfUrl = labelPdfUrl;
  }

  public Integer getLabelResolution() {
    return labelResolution;
  }

  public void setLabelResolution(Integer labelResolution) {
    this.labelResolution = labelResolution;
  }

  public String getLabelSize() {
    return labelSize;
  }

  public void setLabelSize(String labelSize) {
    this.labelSize = labelSize;
  }

  public String getLabelType() {
    return labelType;
  }

  public void setLabelType(String labelType) {
    this.labelType = labelType;
  }

  public String getLabelUrl() {
    return labelUrl;
  }

  public void setLabelUrl(String labelUrl) {
    this.labelUrl = labelUrl;
  }

  public String getLabelZplUrl() {
    return labelZplUrl;
  }

  public void setLabelZplUrl(String labelZplUrl) {
    this.labelZplUrl = labelZplUrl;
  }

  @Override
  public String toString() {
    return "PostageLabelResponse{" + "id='" + id + "'," +"labelDate='" + labelDate + "'," +"labelEpl2Url='" + labelEpl2Url + "'," +"labelFileType='" + labelFileType + "'," +"labelPdfUrl='" + labelPdfUrl + "'," +"labelResolution='" + labelResolution + "'," +"labelSize='" + labelSize + "'," +"labelType='" + labelType + "'," +"labelUrl='" + labelUrl + "'," +"labelZplUrl='" + labelZplUrl + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostageLabelResponse that = (PostageLabelResponse) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(labelDate, that.labelDate) &&
                            java.util.Objects.equals(labelEpl2Url, that.labelEpl2Url) &&
                            java.util.Objects.equals(labelFileType, that.labelFileType) &&
                            java.util.Objects.equals(labelPdfUrl, that.labelPdfUrl) &&
                            java.util.Objects.equals(labelResolution, that.labelResolution) &&
                            java.util.Objects.equals(labelSize, that.labelSize) &&
                            java.util.Objects.equals(labelType, that.labelType) &&
                            java.util.Objects.equals(labelUrl, that.labelUrl) &&
                            java.util.Objects.equals(labelZplUrl, that.labelZplUrl);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, labelDate, labelEpl2Url, labelFileType, labelPdfUrl, labelResolution, labelSize, labelType, labelUrl, labelZplUrl);
  }

  public static com.scienta.cs.types.PostageLabelResponse.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private String labelDate;

    private String labelEpl2Url;

    private String labelFileType;

    private String labelPdfUrl;

    private Integer labelResolution;

    private String labelSize;

    private String labelType;

    private String labelUrl;

    private String labelZplUrl;

    public PostageLabelResponse build() {
                  com.scienta.cs.types.PostageLabelResponse result = new com.scienta.cs.types.PostageLabelResponse();
                      result.id = this.id;
          result.labelDate = this.labelDate;
          result.labelEpl2Url = this.labelEpl2Url;
          result.labelFileType = this.labelFileType;
          result.labelPdfUrl = this.labelPdfUrl;
          result.labelResolution = this.labelResolution;
          result.labelSize = this.labelSize;
          result.labelType = this.labelType;
          result.labelUrl = this.labelUrl;
          result.labelZplUrl = this.labelZplUrl;
                      return result;
    }

    public com.scienta.cs.types.PostageLabelResponse.Builder id(String id) {
      this.id = id;
      return this;
    }

    public com.scienta.cs.types.PostageLabelResponse.Builder labelDate(String labelDate) {
      this.labelDate = labelDate;
      return this;
    }

    public com.scienta.cs.types.PostageLabelResponse.Builder labelEpl2Url(String labelEpl2Url) {
      this.labelEpl2Url = labelEpl2Url;
      return this;
    }

    public com.scienta.cs.types.PostageLabelResponse.Builder labelFileType(String labelFileType) {
      this.labelFileType = labelFileType;
      return this;
    }

    public com.scienta.cs.types.PostageLabelResponse.Builder labelPdfUrl(String labelPdfUrl) {
      this.labelPdfUrl = labelPdfUrl;
      return this;
    }

    public com.scienta.cs.types.PostageLabelResponse.Builder labelResolution(
        Integer labelResolution) {
      this.labelResolution = labelResolution;
      return this;
    }

    public com.scienta.cs.types.PostageLabelResponse.Builder labelSize(String labelSize) {
      this.labelSize = labelSize;
      return this;
    }

    public com.scienta.cs.types.PostageLabelResponse.Builder labelType(String labelType) {
      this.labelType = labelType;
      return this;
    }

    public com.scienta.cs.types.PostageLabelResponse.Builder labelUrl(String labelUrl) {
      this.labelUrl = labelUrl;
      return this;
    }

    public com.scienta.cs.types.PostageLabelResponse.Builder labelZplUrl(String labelZplUrl) {
      this.labelZplUrl = labelZplUrl;
      return this;
    }
  }
}
