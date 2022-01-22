package com.zhl.cloud.stream.controller;

import com.zhl.cloud.stream.service.IProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private IProducerService producerService;

    @GetMapping("/send")
    public String sendMessage(){
        return producerService.send();
    }
}
