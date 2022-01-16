package com.zhl.springcloud2020.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer8101 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8101.class, args);
    }
}
