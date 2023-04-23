package com.scienta.cs.core.exceptions;

public class ServiceValidationException extends RuntimeException {
    public ServiceValidationException(String errMsg) {
        super(errMsg);
    }
}
