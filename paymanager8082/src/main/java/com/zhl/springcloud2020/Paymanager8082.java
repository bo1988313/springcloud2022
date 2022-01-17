package com.zhl.springcloud2020;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @author Administrator
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.zhl.springcloud2020.paymanager.mapper")
public class Paymanager8082 {
    public static void main(String[] args) {
        SpringApplication.run(Paymanager8082.class, args);
    }
}
