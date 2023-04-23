package com.scienta.cs.easypost.core.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EasyPostError {

    private String code;
    private String message;
    private List<EasyPostErrorItem> errors;

}
