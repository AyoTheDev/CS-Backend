package com.scienta.cs.types;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class CurrencyResponse {
  private Long id;

  private String code;

  private String name;

  private Boolean enable;

  private String walletRegex;

  private String priority;

  private String extraIdExists;

  private String extraIdRegex;

  private String logoUrl;

  private Boolean track;

  private String cgId;

  private Boolean isMaxlimit;

  private String network;

  private String smartContract;

  private String networkPrecision;

  public CurrencyResponse() {
  }

  public CurrencyResponse(Long id, String code, String name, Boolean enable, String walletRegex,
      String priority, String extraIdExists, String extraIdRegex, String logoUrl, Boolean track,
      String cgId, Boolean isMaxlimit, String network, String smartContract,
      String networkPrecision) {
    this.id = id;
    this.code = code;
    this.name = name;
    this.enable = enable;
    this.walletRegex = walletRegex;
    this.priority = priority;
    this.extraIdExists = extraIdExists;
    this.extraIdRegex = extraIdRegex;
    this.logoUrl = logoUrl;
    this.track = track;
    this.cgId = cgId;
    this.isMaxlimit = isMaxlimit;
    this.network = network;
    this.smartContract = smartContract;
    this.networkPrecision = networkPrecision;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public String getWalletRegex() {
    return walletRegex;
  }

  public void setWalletRegex(String walletRegex) {
    this.walletRegex = walletRegex;
  }

  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public String getExtraIdExists() {
    return extraIdExists;
  }

  public void setExtraIdExists(String extraIdExists) {
    this.extraIdExists = extraIdExists;
  }

  public String getExtraIdRegex() {
    return extraIdRegex;
  }

  public void setExtraIdRegex(String extraIdRegex) {
    this.extraIdRegex = extraIdRegex;
  }

  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  public Boolean getTrack() {
    return track;
  }

  public void setTrack(Boolean track) {
    this.track = track;
  }

  public String getCgId() {
    return cgId;
  }

  public void setCgId(String cgId) {
    this.cgId = cgId;
  }

  public Boolean getIsMaxlimit() {
    return isMaxlimit;
  }

  public void setIsMaxlimit(Boolean isMaxlimit) {
    this.isMaxlimit = isMaxlimit;
  }

  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public String getSmartContract() {
    return smartContract;
  }

  public void setSmartContract(String smartContract) {
    this.smartContract = smartContract;
  }

  public String getNetworkPrecision() {
    return networkPrecision;
  }

  public void setNetworkPrecision(String networkPrecision) {
    this.networkPrecision = networkPrecision;
  }

  @Override
  public String toString() {
    return "CurrencyResponse{" + "id='" + id + "'," +"code='" + code + "'," +"name='" + name + "'," +"enable='" + enable + "'," +"walletRegex='" + walletRegex + "'," +"priority='" + priority + "'," +"extraIdExists='" + extraIdExists + "'," +"extraIdRegex='" + extraIdRegex + "'," +"logoUrl='" + logoUrl + "'," +"track='" + track + "'," +"cgId='" + cgId + "'," +"isMaxlimit='" + isMaxlimit + "'," +"network='" + network + "'," +"smartContract='" + smartContract + "'," +"networkPrecision='" + networkPrecision + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyResponse that = (CurrencyResponse) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(code, that.code) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(enable, that.enable) &&
                            java.util.Objects.equals(walletRegex, that.walletRegex) &&
                            java.util.Objects.equals(priority, that.priority) &&
                            java.util.Objects.equals(extraIdExists, that.extraIdExists) &&
                            java.util.Objects.equals(extraIdRegex, that.extraIdRegex) &&
                            java.util.Objects.equals(logoUrl, that.logoUrl) &&
                            java.util.Objects.equals(track, that.track) &&
                            java.util.Objects.equals(cgId, that.cgId) &&
                            java.util.Objects.equals(isMaxlimit, that.isMaxlimit) &&
                            java.util.Objects.equals(network, that.network) &&
                            java.util.Objects.equals(smartContract, that.smartContract) &&
                            java.util.Objects.equals(networkPrecision, that.networkPrecision);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, code, name, enable, walletRegex, priority, extraIdExists, extraIdRegex, logoUrl, track, cgId, isMaxlimit, network, smartContract, networkPrecision);
  }

  public static com.scienta.cs.types.CurrencyResponse.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private Long id;

    private String code;

    private String name;

    private Boolean enable;

    private String walletRegex;

    private String priority;

    private String extraIdExists;

    private String extraIdRegex;

    private String logoUrl;

    private Boolean track;

    private String cgId;

    private Boolean isMaxlimit;

    private String network;

    private String smartContract;

    private String networkPrecision;

    public CurrencyResponse build() {
                  com.scienta.cs.types.CurrencyResponse result = new com.scienta.cs.types.CurrencyResponse();
                      result.id = this.id;
          result.code = this.code;
          result.name = this.name;
          result.enable = this.enable;
          result.walletRegex = this.walletRegex;
          result.priority = this.priority;
          result.extraIdExists = this.extraIdExists;
          result.extraIdRegex = this.extraIdRegex;
          result.logoUrl = this.logoUrl;
          result.track = this.track;
          result.cgId = this.cgId;
          result.isMaxlimit = this.isMaxlimit;
          result.network = this.network;
          result.smartContract = this.smartContract;
          result.networkPrecision = this.networkPrecision;
                      return result;
    }

    public com.scienta.cs.types.CurrencyResponse.Builder id(Long id) {
      this.id = id;
      return this;
    }

    public com.scienta.cs.types.CurrencyResponse.Builder code(String code) {
      this.code = code;
      return this;
    }

    public com.scienta.cs.types.CurrencyResponse.Builder name(String name) {
      this.name = name;
      return this;
    }

    public com.scienta.cs.types.CurrencyResponse.Builder enable(Boolean enable) {
      this.enable = enable;
      return this;
    }

    public com.scienta.cs.types.CurrencyResponse.Builder walletRegex(String walletRegex) {
      this.walletRegex = walletRegex;
      return this;
    }

    public com.scienta.cs.types.CurrencyResponse.Builder priority(String priority) {
      this.priority = priority;
      return this;
    }

    public com.scienta.cs.types.CurrencyResponse.Builder extraIdExists(String extraIdExists) {
      this.extraIdExists = extraIdExists;
      return this;
    }

    public com.scienta.cs.types.CurrencyResponse.Builder extraIdRegex(String extraIdRegex) {
      this.extraIdRegex = extraIdRegex;
      return this;
    }

    public com.scienta.cs.types.CurrencyResponse.Builder logoUrl(String logoUrl) {
      this.logoUrl = logoUrl;
      return this;
    }

    public com.scienta.cs.types.CurrencyResponse.Builder track(Boolean track) {
      this.track = track;
      return this;
    }

    public com.scienta.cs.types.CurrencyResponse.Builder cgId(String cgId) {
      this.cgId = cgId;
      return this;
    }

    public com.scienta.cs.types.CurrencyResponse.Builder isMaxlimit(Boolean isMaxlimit) {
      this.isMaxlimit = isMaxlimit;
      return this;
    }

    public com.scienta.cs.types.CurrencyResponse.Builder network(String network) {
      this.network = network;
      return this;
    }

    public com.scienta.cs.types.CurrencyResponse.Builder smartContract(String smartContract) {
      this.smartContract = smartContract;
      return this;
    }

    public com.scienta.cs.types.CurrencyResponse.Builder networkPrecision(String networkPrecision) {
      this.networkPrecision = networkPrecision;
      return this;
    }
  }
}
