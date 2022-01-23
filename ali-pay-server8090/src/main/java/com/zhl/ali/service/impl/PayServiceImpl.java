package com.zhl.ali.service.impl;

import com.zhl.ali.service.IPayService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Administrator
 */
@Service
public class PayServiceImpl implements IPayService {
    @Value("${server.port}")
    private String port;

    @Override
    public String getInfo() {
        return port + " : " + UUID.randomUUID().toString();
    }
}
