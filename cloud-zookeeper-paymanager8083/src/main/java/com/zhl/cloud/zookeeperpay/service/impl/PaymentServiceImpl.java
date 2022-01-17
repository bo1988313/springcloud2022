package com.zhl.cloud.zookeeperpay.service.impl;

import com.zhl.cloud.zookeeperpay.mapper.PaymentMapper;
import com.zhl.cloud.zookeeperpay.service.PaymentService;
import com.zhl.springcloud2020.common.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int addPayment(Payment payment) {
        return paymentMapper.addPayment(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
