package com.zhl.stream.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamConsumer8088 {
    public static void main(String[] args) {
        SpringApplication.run(StreamConsumer8088.class, args);
    }
}
