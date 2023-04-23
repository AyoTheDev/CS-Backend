package com.scienta.cs.easypost.parcel.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ParcelCreateRequest {
    private ParcelDto parcel;
}
