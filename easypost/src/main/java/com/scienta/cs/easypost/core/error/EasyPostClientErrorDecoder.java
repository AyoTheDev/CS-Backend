package com.scienta.cs.easypost.core.error;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

@Slf4j
@RequiredArgsConstructor
public class EasyPostClientErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultErrorDecoder = new Default();
    private final ObjectMapper objectMapper;
    @Override
    public Exception decode(String s, Response response) {
        InputStream inputStream = null;
        try {
            String body = null;
            if (response.request().body() != null) {
               body = new String(response.request().body());
            }
            inputStream = response.body().asInputStream();
            String result = IOUtils.toString(inputStream);
            log.error("ERROR Easy post client {} body {}", result, body);
            EasyPostErrorWrapper easyPostError = objectMapper.readValue(result, EasyPostErrorWrapper.class);
            log.error("ERROR Easy post client exception {}", result);
            throw new EasyPostErrorException(easyPostError, objectMapper.readValue(body, new TypeReference<HashMap<String, Object>>() {}));
        } catch (IOException e) {
            log.error(e.getMessage(),e);
        }finally {
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return defaultErrorDecoder.decode(s, response);
    }
}
