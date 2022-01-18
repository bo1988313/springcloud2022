package com.zhl.feignconsumer.config;

import feign.Logger;
import jdk.nashorn.internal.runtime.options.LoggingOption;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 */
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level getFeignLogLevel(){
        return Logger.Level.FULL;
    }
}
