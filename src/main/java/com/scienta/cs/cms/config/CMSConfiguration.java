package com.scienta.cs.cms.config;

import com.scienta.cs.cms.interceptors.CmsRequestInterceptor;
import com.scienta.cs.nowpayments.core.clients.interceptor.NowpaymentRequestInterceptor;
import feign.Logger;
import org.springframework.context.annotation.Bean;

public class CMSConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public CmsRequestInterceptor requestInterceptor() {
        return new CmsRequestInterceptor();
    }

}
