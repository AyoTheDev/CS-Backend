package com.scienta.cs.easypost.core.clients.interceptor;

import feign.auth.BasicAuthRequestInterceptor;

import java.nio.charset.Charset;

public class EasyPostApiRequestInterceptor extends BasicAuthRequestInterceptor {

    public EasyPostApiRequestInterceptor(String username, String password) {
        super(username, password);
    }

    public EasyPostApiRequestInterceptor(String username, String password, Charset charset) {
        super(username, password, charset);
    }

}
