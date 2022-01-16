package com.zhl.springcloud2020.order.controller;

import com.zhl.springcloud2020.entities.Payment;
import com.zhl.springcloud2020.entities.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/consumer")
@Slf4j
public class ConsumerOrderController {

    private static final String CREATPATH = "http://localhost:8081/payment/create";

    private static final String GETPATH = "http://localhost:8081/payment/get/";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/payment/create")
    public Result savePayment(@RequestBody Payment payment) {
        return restTemplate.postForObject(CREATPATH, payment, Result.class);
    }

    @GetMapping("/payment/get/{id}")
    public Result savePayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(GETPATH + id, Result.class);
    }
}
