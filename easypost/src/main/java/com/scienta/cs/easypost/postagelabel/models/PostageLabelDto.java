package com.scienta.cs.easypost.postagelabel.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostageLabelDto {

    private String id;                      //	Unique, begins with "pl_"
    private String object;                      //	"PostageLabel"
    @JsonProperty("label_date")
    private LocalDateTime labelDate;                       //	The date that appears on the postage label
    @JsonProperty("label_epl2_url")
    private String labelEpl2Url;                      //	The URL of the EPL2 label file
    @JsonProperty("label_file_type")
    private String labelFileType;                     //	File type of the label
    @JsonProperty("label_pdf_url")
    private String labelPdfUrl;                       //	The URL of the PDF label file
    @JsonProperty("label_resolution")
    private Integer labelResolution;                       //	The resolution of the label
    @JsonProperty("label_size")
    private String labelSize;                      //	The size of the label
    @JsonProperty("label_type")
    private String labelType;                      //	The type of the label
    @JsonProperty("label_url")
    private String labelUrl;                       //	The URL of the label file
    @JsonProperty("label_zpl_url")
    private String labelZplUrl;                       //	The URL of the ZPL label file
    @JsonProperty("created_at")
    private LocalDateTime createdAt;                       //
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;                       //

}
