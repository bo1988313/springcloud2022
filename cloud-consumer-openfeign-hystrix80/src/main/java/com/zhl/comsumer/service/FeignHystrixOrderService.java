package com.zhl.comsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Administrator
 */
@Component
@FeignClient("CLOUD-PAYMANAGER-HYSTRIX-SERVICE")
public interface FeignHystrixOrderService {
    /**
     * doOk
     * @param id id
     * @return String
     */
    @GetMapping("/payment/doOk/{id}")
    String doOk(@PathVariable("id") long id);

    /**
     * doTimeout
     * @param id id
     * @return String
     */
    @GetMapping("/payment/doTimeout/{id}")
    String doTimeout(@PathVariable("id") long id);
}
