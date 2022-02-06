package com.zhl.ali.account.controller;

import com.zhl.ali.account.service.IAccountService;
import com.zhl.springcloud2020.common.entities.Order;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Resource
    private IAccountService accountService;

    @PostMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE)
    public String update(@RequestBody Order order) throws Exception {
        if(accountService.updateAccount(order)){
            return "修改用户信息成功";
        }
        return "修改用户信息失败";
    }
}
