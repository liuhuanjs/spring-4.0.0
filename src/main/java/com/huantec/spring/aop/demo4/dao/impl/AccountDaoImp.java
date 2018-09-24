package com.huantec.spring.aop.demo4.dao.impl;

import com.huantec.spring.aop.demo4.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author liuhuan 2018-09-10
 */
public class AccountDaoImp extends JdbcDaoSupport implements AccountDao {

    @Override
    public void outMoney(String name, double money) {
        System.out.println(this.getClass().getName()+".outMoney() is call ...");
        this.getJdbcTemplate().update("update account set money = money- ? where name=?", money, name);
    }

    @Override
    public void inMoney(String name, double money) {
        System.out.println(this.getClass().getName()+".inMoney() is call ...");
        this.getJdbcTemplate().update("update account set money = money+? where name=?", money, name);
    }
}
