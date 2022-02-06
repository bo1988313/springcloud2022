package com.zhl.ali.service;

import com.zhl.springcloud2020.common.entities.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Administrator
 */
@Component
@FeignClient(name="ali-nacos-sentinel-seata-storage")
public interface StorageService {
    @PostMapping(value = "/storage/update", produces = MediaType.APPLICATION_JSON_VALUE)
    String update(@RequestBody Order order);
}
