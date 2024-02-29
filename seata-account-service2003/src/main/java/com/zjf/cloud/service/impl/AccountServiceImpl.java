package com.zjf.cloud.service.impl;

import com.zjf.cloud.mapper.AccountMapper;
import com.zjf.cloud.service.AccountService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author zjf
 * @Date 2024/2/29
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {


    @Resource
    private AccountMapper accountMapper;

    /**
     * 扣减账户余额
     */
    @Override
    public void decrease(Long userId, Long money) {

        log.info("------->account-service中扣减账户余额开始");
        accountMapper.decrease(userId,money);
        //myTimeOut();
        //int age = 10/0;
        log.info("------->account-service中扣减账户余额结束");
    }


    /**
     * 模拟超时异常，全局事务回滚
     */
    private static void myTimeOut(){
        try { TimeUnit.SECONDS.sleep(65); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
