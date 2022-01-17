package com.zhl.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZooKeePerPay8083 {
    public static void main(String[] args) {
        SpringApplication.run(ZooKeePerPay8083.class, args);
    }
}
