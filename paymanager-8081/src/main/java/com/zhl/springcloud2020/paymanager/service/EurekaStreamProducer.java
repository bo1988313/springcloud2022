package com.zhl.springcloud2020.paymanager.service;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Administrator
 */
@Component
@FeignClient("CLOUD-EUREKA-STREAM-PRODUCER")
public interface EurekaStreamProducer {

    /**
     * sendMessage
     * @return String
     */
    @GetMapping("/message/send")
    public String sendMessage();
}
