package com.zhl.ali.service.impl;

import com.zhl.ali.mapper.OrderMapper;
import com.zhl.ali.service.IOrderService;
import com.zhl.springcloud2020.common.entities.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Service
@Slf4j
public class OrderServiceImpl implements IOrderService {
    @Resource
    private OrderMapper orderMapper;

    @Override
    public boolean commitOrder(Order order) {
        try {
            orderMapper.saveOrder(order);
            return true;
        } catch (Exception e) {
            log.error("CommitOrder method failed: ", e);
            return false;
        }
    }
}
