package com.zhl.feignconsumer.service;

import com.zhl.springcloud2020.common.entities.Payment;
import com.zhl.springcloud2020.common.entities.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Administrator
 */
@Component
@FeignClient(name = "CLOUD-PAYMANAGER-SERVICE")
public interface OpenFeignOrderService {

    /**
     * savePayment
     * @param payment payment
     * @return Result
     */
    @PostMapping(value = "/payment/create")
    Result savePayment(@RequestBody Payment payment);

    /**
     * getPayment
     * @param id id
     * @return Result
     */
    @GetMapping(value = "/payment/get/{id}")
    Result getPayment(@PathVariable("id") long id);
}
