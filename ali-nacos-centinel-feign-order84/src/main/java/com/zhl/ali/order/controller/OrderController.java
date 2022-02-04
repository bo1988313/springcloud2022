package com.zhl.ali.order.controller;

import com.zhl.ali.order.service.OrderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping(value = "/testA", produces = MediaType.APPLICATION_JSON_VALUE)
    public String testA(){
        return orderService.testA();
    };

    @GetMapping(value = "/testB", produces = MediaType.APPLICATION_JSON_VALUE)
    String testB(@RequestParam("id") int id){
        return orderService.testB(id);
    };
}
