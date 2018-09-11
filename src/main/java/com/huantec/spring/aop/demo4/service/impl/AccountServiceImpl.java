package com.huantec.spring.aop.demo4.service.impl;

import com.huantec.spring.aop.demo4.dao.AccountDao;
import com.huantec.spring.aop.demo4.service.AccountService;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author liuhuan 2018-09-11
 */
@Transactional
public class AccountServiceImpl implements AccountService {

    @Resource(name = "accountDao")
    private AccountDao accountDao;

    @Override
    public void pay(String payer, String payee, double money) {
        accountDao.outMoney(payer, money);
        int i = 10 / 0; //模拟异常
        accountDao.inMoney(payee, money);
    }
}
