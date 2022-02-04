package com.zhl.ali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PayApplication8092 {
    public static void main(String[] args) {
        SpringApplication.run(PayApplication8092.class, args);
    }
}
