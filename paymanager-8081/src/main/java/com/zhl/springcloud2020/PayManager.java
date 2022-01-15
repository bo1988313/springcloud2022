package com.zhl.springcloud2020;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Administrator
 */
@SpringBootApplication
@MapperScan("com.zhl.springcloud2020.paymanager.mapper")
public class PayManager {
    public static void main(String[] args) {
        SpringApplication.run(PayManager.class, args);
    }
}
