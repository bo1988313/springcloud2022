package com.zhl.hystrixpay.controller;

import com.zhl.hystrixpay.service.HystrixPayServer;
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
    private HystrixPayServer hystrixPayServer;

    @GetMapping("/doOk/{id}")
    public String doOk(@PathVariable("id") long id) {
        return hystrixPayServer.doOk(id);
    }

    @GetMapping("/doTimeout/{id}")
    public String doTimeout(@PathVariable("id") long id) {
        return hystrixPayServer.doTimeOut(id);
    }
}
