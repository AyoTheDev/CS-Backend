package com.scienta.cs.easypost.scanform.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.scienta.cs.easypost.address.models.AddressDto;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScanFormDto {
    private String id;//	Unique, begins with "sf_"
    private String object;//	"ScanForm"
    private ScanFormStatus status;//	Current status. Possible values are "creating", "created" and "failed"
    private String message;//	Human readable message explaining any failures
    private AddressDto address;//	Address that the Shipments will be shipped from
    @JsonProperty("tracking_codes")
    private List<String> trackingCodes;// array	Tracking codes included on the ScanForm
    @JsonProperty("form_url")
    private String formUrl;//	Url of the document
    @JsonProperty("form_file_type")
    private String formFileType;//	File format of the document
    @JsonProperty("batch_id")
    private String batchId;//	The id of the associated Batch. Unique, starts with "batch_"
    @JsonProperty("created_at")
    private LocalDateTime createdAt; //
    @JsonProperty("updated_at")
    private	LocalDateTime updatedAt; //
}
