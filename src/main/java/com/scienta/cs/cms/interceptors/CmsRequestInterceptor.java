package com.scienta.cs.cms.interceptors;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class CmsRequestInterceptor implements RequestInterceptor {

    @Value("${feign.client.cms.token}")
    private String apiToken;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        requestTemplate.header(HttpHeaders.AUTHORIZATION, "Bearer %s".formatted(apiToken));
    }
}
