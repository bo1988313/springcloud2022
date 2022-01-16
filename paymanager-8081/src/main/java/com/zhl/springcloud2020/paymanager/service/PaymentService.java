package com.zhl.springcloud2020.paymanager.service;

import com.zhl.springcloud2020.entities.Payment;

/**
 * @author Administrator
 */
public interface PaymentService {

    /**
     * 新增订单
     *
     * @param payment payment
     * @return int
     */
    int addPayment(Payment payment);

    /**
     * 查找订单
     *
     * @param id id
     * @return Payment
     */
    Payment getPaymentById(Long id);
}
