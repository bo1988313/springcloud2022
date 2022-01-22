package com.zhl.cloud.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamProducer8087 {

    public static void main(String[] args) {
        SpringApplication.run(StreamProducer8087.class, args);
    }
}
