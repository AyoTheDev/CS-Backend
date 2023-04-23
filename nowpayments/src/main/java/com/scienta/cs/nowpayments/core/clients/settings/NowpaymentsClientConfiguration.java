package com.scienta.cs.nowpayments.core.clients.settings;

import com.scienta.cs.nowpayments.core.clients.interceptor.NowpaymentRequestInterceptor;
import feign.Logger;
import org.springframework.context.annotation.Bean;

public class NowpaymentsClientConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public NowpaymentRequestInterceptor requestInterceptor() {
        return new NowpaymentRequestInterceptor();
    }

}
