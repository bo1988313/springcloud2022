package com.zhl.ali.account.mapper;

import com.zhl.springcloud2020.common.entities.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
@Mapper
public interface AccountMapper {
    /**
     * 修改用户信息
     * @param account account
     * @return int
     */
    int updateAccount(Account account);

    /**
     * 查询用户信息
     * @param userId 用户id
     * @return 用户信息
     */
    Account selectAccountByUserId(@Param("userid") int userId);
}
