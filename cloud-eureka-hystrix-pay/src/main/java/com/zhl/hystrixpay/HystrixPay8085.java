package com.zhl.hystrixpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class HystrixPay8085 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixPay8085.class, args);
    }
}
