package com.zhl.hystrixpay.service;

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
