package com.zhl.springcloud2020.paymanager.service.impl;

import com.zhl.springcloud2020.entities.Payment;
import com.zhl.springcloud2020.paymanager.mapper.PaymentMapper;
import com.zhl.springcloud2020.paymanager.service.PaymentService;
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
