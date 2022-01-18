package com.zhl.springcloud2020;

import com.zhl.myrule.IRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMANAGER-SERVICE", configuration = IRuleConfig.class)
public class EurekaConsumerOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerOrder80.class, args);
    }
}
