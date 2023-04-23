package com.scienta.cs.nowpayments.validator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.SignatureException;
import java.util.Formatter;
import java.util.TreeMap;

import static javax.xml.crypto.dsig.SignatureMethod.HMAC_SHA512;

@Service
@RequiredArgsConstructor
public class CallbackRequestValidatorService {

    public final ObjectMapper objectMapper;

    @Value("${feign.client.nowpayments.ipnSecret}")
    private String ipnSecret;


    @SneakyThrows
    public void validateRequest(TreeMap<String, Object> request, String signature) {

        String jsonString = null;
        try {
            jsonString = objectMapper.writeValueAsString(request);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        if(jsonString == null) {
            throw new SignatureException("Json for request not valid");
        }

//        String hmac = calculateHMAC(jsonString,ipnSecret);

//        if(!hmac.equals(signature)) {
//            throw new SignatureException("Signature for request not valid");
//        }

    }

    private static String toHexString(byte[] bytes) {
        Formatter formatter = new Formatter();
        for (byte b : bytes) {
            formatter.format("%02x", b);
        }
        return formatter.toString();
    }

    @SneakyThrows
    private static String calculateHMAC(String data, String key) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), HMAC_SHA512);
        Mac mac = Mac.getInstance("HmacSHA512");
        mac.init(secretKeySpec);
        return toHexString(mac.doFinal(data.getBytes()));
    }

}
