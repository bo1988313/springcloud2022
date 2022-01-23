package com.zhl.ali.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/nacos")
public class OrderController {

    @Value("${zhl.config.pay.serverpath}")
    private String serverPath;

    @Value("${zhl.config.pay.orderpath}")
    private String orderPath;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/order", produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveOrder() {
        Map<String, Object> param = new HashMap<>();
        param.put("id", 1);
        return restTemplate.postForObject(serverPath+ orderPath, param, String.class);
    }
}
