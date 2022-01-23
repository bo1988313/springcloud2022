package com.zhl.ali.controller;

import com.zhl.ali.service.IPayService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/nacos")
public class PayController {
    @Resource
    private IPayService payService;

    @PostMapping(value = "/pay/order", produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveOrder(@RequestBody Map<String, Object> map) {
        System.out.println(map.get("id").toString());
        return payService.getInfo();
    }
}
