package com.zhl.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RefreshScope
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Value("${zhl.info}")
    private String info ;

    @RequestMapping(value = "/info", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getInfo(){
        return info;
    }
}
