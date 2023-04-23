package com.scienta.cs.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class ShipmentRequest {
  private ParcelRequest parcel;

  private AddressRequest fromAddress;

  private AddressRequest toAddress;

  private SignatureType signatureType;

  public ShipmentRequest() {
  }

  public ShipmentRequest(ParcelRequest parcel, AddressRequest fromAddress, AddressRequest toAddress,
      SignatureType signatureType) {
    this.parcel = parcel;
    this.fromAddress = fromAddress;
    this.toAddress = toAddress;
    this.signatureType = signatureType;
  }

  public ParcelRequest getParcel() {
    return parcel;
  }

  public void setParcel(ParcelRequest parcel) {
    this.parcel = parcel;
  }

  public AddressRequest getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(AddressRequest fromAddress) {
    this.fromAddress = fromAddress;
  }

  public AddressRequest getToAddress() {
    return toAddress;
  }

  public void setToAddress(AddressRequest toAddress) {
    this.toAddress = toAddress;
  }

  public SignatureType getSignatureType() {
    return signatureType;
  }

  public void setSignatureType(SignatureType signatureType) {
    this.signatureType = signatureType;
  }

  @Override
  public String toString() {
    return "ShipmentRequest{" + "parcel='" + parcel + "'," +"fromAddress='" + fromAddress + "'," +"toAddress='" + toAddress + "'," +"signatureType='" + signatureType + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipmentRequest that = (ShipmentRequest) o;
        return java.util.Objects.equals(parcel, that.parcel) &&
                            java.util.Objects.equals(fromAddress, that.fromAddress) &&
                            java.util.Objects.equals(toAddress, that.toAddress) &&
                            java.util.Objects.equals(signatureType, that.signatureType);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(parcel, fromAddress, toAddress, signatureType);
  }

  public static com.scienta.cs.types.ShipmentRequest.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private ParcelRequest parcel;

    private AddressRequest fromAddress;

    private AddressRequest toAddress;

    private SignatureType signatureType;

    public ShipmentRequest build() {
                  com.scienta.cs.types.ShipmentRequest result = new com.scienta.cs.types.ShipmentRequest();
                      result.parcel = this.parcel;
          result.fromAddress = this.fromAddress;
          result.toAddress = this.toAddress;
          result.signatureType = this.signatureType;
                      return result;
    }

    public com.scienta.cs.types.ShipmentRequest.Builder parcel(ParcelRequest parcel) {
      this.parcel = parcel;
      return this;
    }

    public com.scienta.cs.types.ShipmentRequest.Builder fromAddress(AddressRequest fromAddress) {
      this.fromAddress = fromAddress;
      return this;
    }

    public com.scienta.cs.types.ShipmentRequest.Builder toAddress(AddressRequest toAddress) {
      this.toAddress = toAddress;
      return this;
    }

    public com.scienta.cs.types.ShipmentRequest.Builder signatureType(SignatureType signatureType) {
      this.signatureType = signatureType;
      return this;
    }
  }
}
