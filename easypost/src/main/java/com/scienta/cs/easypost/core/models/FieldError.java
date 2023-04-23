package com.scienta.cs.easypost.core.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FieldError {

    String field; //	Field of the request that the error describes
    String message; //	Human readable description of the problem

}
