package com.zhl.ali.order.service;

import com.zhl.ali.order.service.impl.OrderServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator
 */
@Component
@FeignClient(name = "ali-nacos-sentinel-pay" ,fallback = OrderServiceImpl.class)
public interface OrderService {

    @GetMapping(value = "/pay/testA", produces = MediaType.APPLICATION_JSON_VALUE)
    String testA();

    @PostMapping(value = "/pay/testB", produces = MediaType.APPLICATION_JSON_VALUE)
    String testB(@RequestParam("id") int id);
}
