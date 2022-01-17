package com.zhl.springcloud2020.order.controller;

import com.zhl.springcloud2020.common.entities.Payment;
import com.zhl.springcloud2020.common.entities.Result;
import lombok.extern.slf4j.Slf4j;
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
    /**
     * 新增订单接口
     */
    private static final String CREATPATH = "payment/create";
    /**
     * 查询订单接口
     */
    private static final String GETPATH = "payment/get/";
    /**
     * 订单服务路径
     */
    private static final String PAYMANAGER_PATH = "http://CLOUD-PAYMANAGER-SERVICE/";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/payment/create")
    public Result savePayment(@RequestBody Payment payment) {
        return restTemplate.postForObject(PAYMANAGER_PATH + CREATPATH, payment, Result.class);
    }

    @GetMapping("/payment/get/{id}")
    public Result savePayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMANAGER_PATH + GETPATH + id, Result.class);
    }
}
