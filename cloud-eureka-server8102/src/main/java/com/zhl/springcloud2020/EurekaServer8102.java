package com.zhl.springcloud2020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer8102 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8102.class, args);
    }
}
