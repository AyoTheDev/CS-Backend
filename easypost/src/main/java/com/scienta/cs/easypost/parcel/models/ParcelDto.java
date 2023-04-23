package com.scienta.cs.easypost.parcel.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParcelDto {

    private	String id;                       ;//Unique, begins with "prcl_"
    private	String object;                       ;//"Parcel"
    private	String mode;                       ;//"test" or "production"
    private	Float length;                       ;//(inches)	Required if width and/or height are present
    private	Float width;                       ;//(inches)	Required if length and/or height are present
    private	Float height;                       ;//(inches)	Required if length and/or width are present
    @JsonProperty("predefined_package")
    private	String predefinedPackage;           ;//Optional, one of our predefinedPackages
    @NotNull()
    private	Float weight;                       ;//(oz)	Always required
    @JsonProperty("createdAt")
    private LocalDateTime createdAt;
    @JsonProperty("updatedAt")
    private	LocalDateTime updatedAt;

}
