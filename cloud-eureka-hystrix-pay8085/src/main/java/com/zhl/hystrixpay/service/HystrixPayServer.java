package com.zhl.hystrixpay.service;

import com.zhl.springcloud2020.common.entities.Result;

/**
 * @author Administrator
 */
public interface HystrixPayServer {

    /**
     *  doOk
     * @param id id
     * @return String
     */
    String doOk(long id);

    /**
     * doTimeOut
     * @param id id
     * @return String
     */
    String doTimeOut(long id);

    /**
     * circuitBreaker
     * @param id id
     * @return String
     */
    String circuitBreaker(long id) throws Exception;
}
