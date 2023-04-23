package com.scienta.cs.easypost.form.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FormDto {


    private	String id;//	Unique, begins with "form_"
    private	String object;//	"Form"
    private	String mode;//	"test" or "production"
    @JsonProperty("form_type")
    private	String formType;//	The type of form that we returned, can be one of "high_value_report", "commercial_invoice", "cod_return_label", "order_summary", "cn22"
    @JsonProperty("form_url")
    private	String formUrl;//	The address we return the form back at
    @JsonProperty("submitted_electronically")
    private	Boolean submittedElectronically;//	If we have submitted the form to the carrier on behalf of the customer
    @JsonProperty("created_at")
    private LocalDateTime createdAt; //
    @JsonProperty("updated_at")
    private	LocalDateTime updatedAt; //

}
