package com.scienta.cs.easypost.core.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConvertLabelFormatRequest {
    @JsonProperty("file_format")
    private String fileFormat;
}
