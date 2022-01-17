package com.zhl.consumerzk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Consumer80 {

    public static void main(String[] args) {
        SpringApplication.run(Consumer80.class, args);
    }
}
