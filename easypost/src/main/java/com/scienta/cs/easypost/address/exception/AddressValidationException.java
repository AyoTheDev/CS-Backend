package com.scienta.cs.easypost.address.exception;


import com.scienta.cs.easypost.core.models.FieldError;
import lombok.Data;

import java.util.List;

@Data
public class AddressValidationException extends RuntimeException {

    private List<FieldError> errors;

    public AddressValidationException(List<FieldError> errors) {
        super(errors.toString());
    }

}
