package com.scienta.cs.postagelabel.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "postage_label")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PostageLabel {
    @Id
    @Column(name = "id", nullable = false, length = 512)
    private String id;
    private LocalDateTime labelDate;                       //	The date that appears on the postage label
    private String labelEpl2Url;                      //	The URL of the EPL2 label file
    private String labelFileType;                     //	File type of the label
    private String labelPdfUrl;                       //	The URL of the PDF label file
    private Integer labelResolution;                       //	The resolution of the label
    private String labelSize;                      //	The size of the label
    private String labelType;                      //	The type of the label
    private String labelUrl;                       //	The URL of the label file
    private String labelZplUrl;                       //	The URL of the ZPL label file
    private LocalDateTime createdAt;                       //
    private LocalDateTime updatedAt;                       //


}
