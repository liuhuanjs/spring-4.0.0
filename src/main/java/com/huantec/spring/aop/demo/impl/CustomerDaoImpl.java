package com.huantec.spring.aop.demo.impl;

import com.huantec.spring.aop.demo.CustomerDao;

/**
 * @author liuhuan 2018-09-09
 */
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void save() {
        System.out.println("保存客户信息 ... ");
    }

    @Override
    public void update() {
        System.out.println("更新客户信息 ... ");
    }
}
