package com.scienta.cs.easypost.core.error;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class EasyPostErrorException extends RuntimeException {
    private EasyPostErrorWrapper easyPostError;
    private HashMap<String,Object> reqBody;

    public EasyPostErrorException(EasyPostErrorWrapper easyPostError, HashMap<String, Object> reqBody) {
        this.easyPostError = easyPostError;
        this.reqBody = reqBody;
    }
}
