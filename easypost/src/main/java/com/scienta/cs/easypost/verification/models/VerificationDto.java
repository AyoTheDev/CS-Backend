package com.scienta.cs.easypost.verification.models;

import com.scienta.cs.easypost.core.models.FieldError;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VerificationDto {

    private boolean success; //	The success of the verification
    private List<FieldError> errors; // array	All errors that caused the verification to fail
    private VerificationDetails details; //	Extra data related to the verification

}
