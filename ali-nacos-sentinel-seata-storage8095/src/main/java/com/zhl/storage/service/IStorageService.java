package com.zhl.storage.service;

import com.zhl.springcloud2020.common.entities.Order;

/**
 * @author Administrator
 */
public interface IStorageService {
    /**
     * order修改库存信息
     * @param order order
     * @return boolean
     */
    boolean updateStorage(Order order) throws Exception;
}
