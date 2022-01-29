package com.zhl.ali.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping(value = "/a", produces = MediaType.APPLICATION_JSON_VALUE)
    @SentinelResource("/test/a")
    public String testA()
    {
        return "TestA";
    }

    @GetMapping(value = "/b", produces = MediaType.APPLICATION_JSON_VALUE)
    @SentinelResource("/test/b")
    public String testB()
    {
        return "TestB";
    }
}
