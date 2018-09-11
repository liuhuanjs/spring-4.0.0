package com.huantec.spring.aop.demo4.dao;

/**
 * 账户进行转账操作
 *
 * @author liuhuan 2018-09-10
 */
public interface AccountDao {
    /**
     * 扣除
     *
     * @param name
     * @param money
     */
    void outMoney(String name, double money);

    /**
     * 划入
     *
     * @param name
     * @param money
     */
    void inMoney(String name, double money);
}
