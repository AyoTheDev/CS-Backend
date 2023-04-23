package com.scienta.cs.scanform.model.entity;

import com.scienta.cs.address.model.entity.Address;
import com.scienta.cs.core.attributeconverters.ListToStringConverter;
import com.scienta.cs.easypost.scanform.models.ScanFormStatus;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "scan_form")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScanForm {
    @Id
    @Column(name = "id", nullable = false, length = 512)
    private String id;

    private ScanFormStatus status;//	Current status. Possible values are "creating", "created" and "failed"
    private String message;//	Human readable message explaining any failures
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;//	Address that the Shipments will be shipped from
    @Convert(converter = ListToStringConverter.class)
    private List<String> trackingCodes;// array	Tracking codes included on the ScanForm
    private String formUrl;//	Url of the document
    private String formFileType;//	File format of the document
    private String batchId;//	The id of the associated Batch. Unique, starts with "batch_"
    private LocalDateTime createdAt; //
    private LocalDateTime updatedAt; //

}
