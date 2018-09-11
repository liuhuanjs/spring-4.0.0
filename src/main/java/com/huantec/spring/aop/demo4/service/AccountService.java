package com.huantec.spring.aop.demo4.service;

/**
 * @author liuhuan 2018-09-11
 */
public interface AccountService {
    /**
     * 支付动作
     */
    void pay(String payer, String payee, double money);
}
