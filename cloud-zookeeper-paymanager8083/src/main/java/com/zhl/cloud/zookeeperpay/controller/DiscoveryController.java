package com.zhl.cloud.zookeeperpay.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 服务发现相关应用
 * @author Administrator
 */
@RestController
@RequestMapping("/discovery")
public class DiscoveryController {

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/info")
    public Object getDiscoveryInfo(){
        Map<String, List<ServiceInstance>> result = new HashMap<>();
        for (String server: discoveryClient.getServices()) {
            List<ServiceInstance> instances = discoveryClient.getInstances(server);
            result.put(server, instances);
        }
        return result;
    }
}
