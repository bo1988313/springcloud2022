package com.zhl.stream.comsumer.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
@EnableBinding(Sink.class)
public class ConsumerService {

    /**
     * 第三种
     * @param msg
     */
    @StreamListener(Sink.INPUT)
    public void onMessage(String msg){
        System.out.println("第三种 stream接收到消息   " + msg);
    }

}
