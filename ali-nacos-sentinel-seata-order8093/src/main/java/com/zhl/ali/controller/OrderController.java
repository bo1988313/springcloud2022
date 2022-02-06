package com.zhl.ali.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhl.ali.service.AccountService;
import com.zhl.ali.service.IOrderService;
import com.zhl.ali.service.StorageService;
import com.zhl.springcloud2020.common.entities.Order;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private IOrderService orderService;

    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;

    @PostMapping(value = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
    public String orderProduct(@RequestBody Order order){
        JSONObject obj = new JSONObject();
        obj.put("account", accountService.update(order));
        obj.put("storage", storageService.update(order));
        if(orderService.commitOrder(order)){
            obj.put("order", "提交订单成功");
        }else{
            obj.put("order", "提交订单失败");
        }
        return obj.toJSONString();
    }

}
