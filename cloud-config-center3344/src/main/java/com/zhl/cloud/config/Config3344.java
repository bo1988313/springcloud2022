package com.zhl.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class Config3344 {
    public static void main(String[] args) {
        SpringApplication.run(Config3344.class, args);
    }
}
