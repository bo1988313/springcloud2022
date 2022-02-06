package com.zhl.ali.account.service;

import com.zhl.springcloud2020.common.entities.Order;

/**
 * @author Administrator
 */
public interface IAccountService {
    /**
     * 修改用户信息
     * @param order order
     * @return Y/N
     * @throws Exception Exception
     */
    boolean updateAccount(Order order) throws Exception;
}
