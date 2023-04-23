package com.scienta.cs.easypost.core.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EasyPostErrorItem {

    private String code;
    private String field;
    private String message;
    private String suggestion;

}
