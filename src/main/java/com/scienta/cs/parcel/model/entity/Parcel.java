package com.scienta.cs.parcel.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "parcel")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Parcel {

    @Id
    @Column(name = "id", nullable = false, length = 512)
    private	String id;                       ;//Unique, begins with "prcl_"
    private	String object;                       ;//"Parcel"
    private	String mode;                       ;//"test" or "production"
    private	Float length;                       ;//(inches)	Required if width and/or height are present
    private	Float width;                       ;//(inches)	Required if length and/or height are present
    private	Float height;                       ;//(inches)	Required if length and/or width are present
    private	String predefinedPackage;           ;//Optional, one of our predefinedPackages
    private	Float weight;                       ;//(oz)	Always required
    private LocalDateTime createdAt;
    private	LocalDateTime updatedAt;

}
