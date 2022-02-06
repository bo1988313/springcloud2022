package com.zhl.ali.account.service.impl;

import com.zhl.ali.account.mapper.AccountMapper;
import com.zhl.ali.account.service.IAccountService;
import com.zhl.springcloud2020.common.entities.Order;
import lombok.val;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Service
public class AccountServiceImpl implements IAccountService {
    @Resource
    private AccountMapper accountMapper;

    @Override
    public boolean updateAccount(Order order) throws Exception {
        final val account = accountMapper.selectAccountByUserId(order.getUserid());
        if(null == account){
            throw new Exception("该用户不存在");
        }
        account.setUsed(account.getUsed() + order.getMoney() * order.getCount());
        account.setResidue(account.getTotal() - order.getMoney() * order.getCount());
        if(account.getResidue() < 0){
            throw new Exception("用户余额不足");
        }
        int line = accountMapper.updateAccount(account);
        if(line > 0){
            return true;
        }
        return false;
    }
}
