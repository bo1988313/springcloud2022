package com.zhl.feignconsumer.controller;

import com.zhl.feignconsumer.service.OpenFeignOrderService;
import com.zhl.springcloud2020.common.entities.Payment;
import com.zhl.springcloud2020.common.entities.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

    @Resource
    private OpenFeignOrderService openFeignOrderService;

    @GetMapping(value = "/payment/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result savePayment(@RequestBody Payment payment) {
        return openFeignOrderService.savePayment(payment);
    }

    @GetMapping(value = "/payment/get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result savePayment(@PathVariable("id") Long id) {
        return openFeignOrderService.getPayment(id);
    }
}
