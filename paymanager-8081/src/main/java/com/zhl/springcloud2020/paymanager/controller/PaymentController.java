package com.zhl.springcloud2020.paymanager.controller;

import com.netflix.discovery.DiscoveryClient;
import com.zhl.springcloud2020.common.entities.Payment;
import com.zhl.springcloud2020.common.entities.Result;
import com.zhl.springcloud2020.paymanager.service.EurekaStreamProducer;
import com.zhl.springcloud2020.paymanager.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@RestController
@RequestMapping(value="/payment")
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @Resource
    private EurekaStreamProducer eurekaStreamProducer;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result savePayment(@RequestBody Payment payment) {
        int num = paymentService.addPayment(payment);
        eurekaStreamProducer.sendMessage();
        if (num > 0) {
            log.info("订单插入成功");
            return new Result(200, "订单插入成功: port" + port, payment);
        } else {
            log.warn("订单插入失败：" + payment.toString());
            return new Result(400, "订单插入失败", null);
        }
    }

    @GetMapping(value = "/get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result getPayment(@PathVariable("id") long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (null == payment) {
            log.warn("查询订单失败： " + id);
            return new Result(400, "查询失败", null);
        } else {
            log.warn("查询订单成功： " + payment.toString());
            return new Result(200, "查询订单成功 , port:" + port, payment);
        }
    }
}
