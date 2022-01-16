package com.zhl.springcloud2020.paymanager.controller;

import com.zhl.springcloud2020.common.entities.Payment;
import com.zhl.springcloud2020.common.entities.Result;
import com.zhl.springcloud2020.paymanager.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
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

    @PostMapping("/create")
    public Result savePayment(@RequestBody Payment payment) {
        int num = paymentService.addPayment(payment);
        if (num > 0) {
            log.info("订单插入成功");
            return new Result(200, "订单插入成功", payment);
        } else {
            log.warn("订单插入失败：" + payment.toString());
            return new Result(400, "订单插入失败", null);
        }
    }

    @GetMapping("/get/{id}")
    public Result getPayment(@PathVariable("id") long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (null == payment) {
            log.warn("查询订单失败： " + id);
            return new Result(400, "查询失败aaaaaaaaaa", null);
        } else {
            log.warn("查询订单成功： " + payment.toString());
            return new Result(200, "查询订单成功cccccc", payment);
        }
    }
}
