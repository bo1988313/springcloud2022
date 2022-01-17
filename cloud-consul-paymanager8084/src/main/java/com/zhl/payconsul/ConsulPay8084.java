package com.zhl.payconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulPay8084 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulPay8084.class, args);
    }
}
