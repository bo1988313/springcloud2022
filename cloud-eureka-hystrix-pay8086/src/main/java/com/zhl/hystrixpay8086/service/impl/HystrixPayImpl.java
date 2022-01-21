package com.zhl.hystrixpay8086.service.impl;

import cn.hutool.core.lang.UUID;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zhl.hystrixpay8086.service.HystrixPayServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 */
@DefaultProperties(defaultFallback = "defaultOutHandler")
@Service
public class HystrixPayImpl implements HystrixPayServer {
    @Value("${server.port}")
    private String port;

    @Override
    public String doOk(long id) {
        return "端口:" + port + "执行成功";
    }

    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "6000")
    })
    @Override
    public String doTimeOut(long id){
        try {
            TimeUnit.MILLISECONDS.sleep(id * 1000);
        } catch (InterruptedException e) {
        }
        return "端口:" + port + "执行延迟";
    }

    @HystrixCommand(commandProperties = {
            @HystrixProperty(name="circuitBreaker.enabled", value = "true"),
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds", value = "5000"),
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage", value = "50"),
    })
    @Override
    public String circuitBreaker(long id) throws Exception {
        if(id < 0){
            throw new Exception();
        }
        String uuId = UUID.randomUUID().toString();
        return uuId;
    }


    public String defaultOutHandler() {
        return "端口:" + port + "系统繁忙或者运行出错，清稍后再试。";
    }
}
