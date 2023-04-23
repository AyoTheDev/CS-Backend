package com.scienta.cs.core.configs;

import com.scienta.cs.core.models.AppSettings;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Clock;

@Configuration
public class Beans {

    @Bean
    @ConfigurationProperties(prefix = "settings")
    public AppSettings appSettings() {
        return new AppSettings();
    }

    @Bean
    public Clock clock() {
        return Clock.systemDefaultZone();
    }
}
