package com.zhl.hystrixpay8086.controller;

import com.zhl.hystrixpay8086.service.HystrixPayServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@RestController
@RequestMapping(value="/payment")
@Slf4j
@RefreshScope
public class PaymentController {

    @Value("${config.version}")
    private String version;

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

    @GetMapping("/circuitbreaker/{id}")
    public String circuitBreaker(@PathVariable("id") long id) {
        try {
            return hystrixPayServer.circuitBreaker(id);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @GetMapping("/propertiesinfo")
    public String circuitBreaker() {
        try {
            return version;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
