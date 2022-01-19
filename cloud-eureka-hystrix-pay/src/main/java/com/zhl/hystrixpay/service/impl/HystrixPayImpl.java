package com.zhl.hystrixpay.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.conf.HystrixPropertiesManager;
import com.zhl.hystrixpay.service.HystrixPayServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 */
@Service
public class HystrixPayImpl implements HystrixPayServer {
    @Value("${server.port}")
    private String port;

    @Override
    public String doOk(long id) {
        return "端口:" + port + "执行成功";
    }

//    @HystrixCommand(fallbackMethod = "doTimeOutHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "10000")
//    })
    @Override
    public String doTimeOut(long id){
        try {
            TimeUnit.MILLISECONDS.sleep(id * 1000);
        } catch (InterruptedException e) {
        }
        return "端口:" + port + "执行延迟";
    }

    public String doTimeOutHandler(long id) {
        return "端口:" + port + "系统繁忙或者运行出错，清稍后再试。";
    }


}
