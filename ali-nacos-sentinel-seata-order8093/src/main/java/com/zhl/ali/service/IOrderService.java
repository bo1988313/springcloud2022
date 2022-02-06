package com.zhl.ali.service;

import com.zhl.springcloud2020.common.entities.Order;

/**
 * @author Administrator
 */
public interface IOrderService {
    /**
     * 提交订单
     * @param order
     * @return Y/N
     */
    boolean commitOrder(Order order);
}
