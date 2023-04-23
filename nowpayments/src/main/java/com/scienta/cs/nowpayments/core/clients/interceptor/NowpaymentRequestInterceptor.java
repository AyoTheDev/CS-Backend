package com.scienta.cs.nowpayments.core.clients.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class NowpaymentRequestInterceptor implements RequestInterceptor {

    @Autowired
    private NowPaymentAuthService authService;

    @Value("${feign.client.nowpayments.apiToken}")
    private String apiToken;

    private final String X_API_KEY = "x-api-key";

    private final String authPath = "/auth";

    private final String bearer = "Bearer %s";

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        requestTemplate.header(X_API_KEY, apiToken);

        if (requestTemplate.url().equals(authPath)) {
            return;
        }

        AuthResponse token = authService.getCurrentToken();

        if (token == null) {
            throw new RuntimeException("Current token is null");
        }

        requestTemplate.header(HttpHeaders.AUTHORIZATION, bearer.formatted(token.getToken()));
    }
}
