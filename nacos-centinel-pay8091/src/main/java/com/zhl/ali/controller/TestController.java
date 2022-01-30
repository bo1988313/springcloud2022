package com.zhl.ali.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zhl.ali.handler.Myhandler;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping(value = "/a", produces = MediaType.APPLICATION_JSON_VALUE)
    public String testA()
    {
        return "TestA";
    }
    @GetMapping(value = "/b", produces = MediaType.APPLICATION_JSON_VALUE)
    public String testB()
    {
        return "TestB";
    }
    @GetMapping(value = "/c", produces = MediaType.APPLICATION_JSON_VALUE)
    public String testC() throws InterruptedException {
        Thread.sleep(1000);
        return "TestC";
    }
    @GetMapping(value = "/testHotKey", produces = MediaType.APPLICATION_JSON_VALUE)
    @SentinelResource(value = "testHotKey" , blockHandler = "dealHostKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,@RequestParam(value = "p1", required = false) String p2)  {
        return "it,s hotKey";
    }

    public String dealHostKey(String p1, String p2, BlockException ex)  {
            return "热点限流";
    }

    @GetMapping(value = "/gloabLimit", produces = MediaType.APPLICATION_JSON_VALUE)
    @SentinelResource(value = "gloabLimit" , blockHandlerClass = Myhandler.class, blockHandler = "dealBlockException")
    public String gloabLimit()  {
        return "it,s Gloab";
    }
}
