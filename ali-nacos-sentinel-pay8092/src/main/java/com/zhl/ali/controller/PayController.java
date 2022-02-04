package com.zhl.ali.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/pay")
public class PayController {

    @Value("${server.port}")
    private String port;
    @GetMapping(value = "/testA", produces = MediaType.APPLICATION_JSON_VALUE)
    public String testA(){
        return "端口:" + port + "返回 TestA";
    }

    @PostMapping(value = "/testB", produces = MediaType.APPLICATION_JSON_VALUE)
    public String testB(@RequestParam("id") int id){
        try {
            Thread.sleep(1000 * id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "端口:" + port + "返回 TestB";
    }
}
