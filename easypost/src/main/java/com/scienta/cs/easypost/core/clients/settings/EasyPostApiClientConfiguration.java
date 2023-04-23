package com.scienta.cs.easypost.core.clients.settings;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.scienta.cs.easypost.core.clients.interceptor.EasyPostApiRequestInterceptor;
import com.scienta.cs.easypost.core.error.EasyPostClientErrorDecoder;
import feign.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;


/**
 * Authentication and identification to the EasyPost API is done by providing an API Key on every request as your Basic Auth username (no password is required).
 * EasyPost requires that all communication with the API is secured using TLS v1.2. Requests made over HTTP or without a proper API Key will fail.
 * */
public class EasyPostApiClientConfiguration {

    @Value("${feign.client.easypost.apiToken}")
    private String apitoken;

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }


    @Bean
    public EasyPostApiRequestInterceptor requestInterceptor() {
        return new EasyPostApiRequestInterceptor(apitoken, "");
    }

    @Bean
    public EasyPostClientErrorDecoder errorDecoder(ObjectMapper objectMapper) {
        return new EasyPostClientErrorDecoder(objectMapper);
    }

}
