package com.zhl.comsumer.service;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
public class FeignHystrixOrderFallBackServiceImpl implements FeignHystrixOrderService{
    @Override
    public String doOk(long id) {
        return "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    }

    @Override
    public String doTimeout(long id) {
        return "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    }
}
