package com.scienta.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication()
@EnableFeignClients(basePackages = {
        "com.scienta"
})
@EnableScheduling
@ComponentScan(basePackages="com.scienta")
@EnableAsync
public class CryptoShippingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CryptoShippingApplication.class, args);
    }

}
