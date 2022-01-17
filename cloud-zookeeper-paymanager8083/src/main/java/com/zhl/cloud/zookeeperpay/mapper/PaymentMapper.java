package com.zhl.cloud.zookeeperpay.mapper;

import com.zhl.springcloud2020.common.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
@Mapper
public interface PaymentMapper {

    /**
     * 新增订单
     * @param payment payment
     * @return int
     */
    int addPayment(Payment payment);

    /**
     * 查找订单
     * @param id id
     * @return Payment
     */
    Payment getPaymentById(@Param("id")Long id);
}
