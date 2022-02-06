package com.zhl.ali.mapper;

import com.zhl.springcloud2020.common.entities.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 */
@Mapper
public interface OrderMapper {
    /**
     * 保存订单
     * @param order order
     */
    void saveOrder(Order order);
}
