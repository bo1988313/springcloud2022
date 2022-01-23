package com.zhl.stream.comsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamConsumer8089 {
    public static void main(String[] args) {
        SpringApplication.run(StreamConsumer8089.class, args);
    }
}
