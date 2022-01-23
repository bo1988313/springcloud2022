package com.zhl.nacos.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigApp3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApp3344.class, args);
    }
}
