package com.zhl.ali.order.service.impl;

import com.zhl.ali.order.service.OrderService;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
public class OrderServiceImpl implements OrderService {
    @Override
    public String testA() {
        return dealMethod("testA");
    }

    @Override
    public String testB(int id) {
        return dealMethod("testB");
    }

    private String dealMethod(String methodName) {
        return "方法：" + methodName + " openfeign 异常处理方法";
    }
}
