package com.zhl.consumerzk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZkConsumer80 {

    public static void main(String[] args) {
        SpringApplication.run(ZkConsumer80.class, args);
    }
}
