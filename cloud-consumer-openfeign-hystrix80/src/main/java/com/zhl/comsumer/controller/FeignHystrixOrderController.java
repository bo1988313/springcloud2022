package com.zhl.comsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zhl.comsumer.service.FeignHystrixOrderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/order")
public class FeignHystrixOrderController {
    @Resource
    private FeignHystrixOrderService feignHystrixOrderService;

    @GetMapping(value = "/payment/doOk/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    String doOk(@PathVariable("id") long id) {
        return feignHystrixOrderService.doOk(id);
    }

    @HystrixCommand(fallbackMethod = "doTimeoutHandle",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
            }
    )
    @GetMapping(value = "/payment/doTimeout/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    String doTimeout(@PathVariable("id") long id) {
        return feignHystrixOrderService.doTimeout(id);
    }

    String doTimeoutHandle(@PathVariable("id") long id) {
        return "消费端80 调用服务端失败，请稍后再试。";
    }
}
