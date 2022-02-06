package com.zhl.storage.controller;

import com.zhl.springcloud2020.common.entities.Order;
import com.zhl.storage.service.IStorageService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/storage")
public class StorageController {
    @Resource
    private IStorageService storageService;

    @PostMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public String update(@RequestBody Order order) throws Exception {
        if(storageService.updateStorage(order)){
            return "库存信息修改成功";
        }
        return "库存信息修改失败";
    }
}
