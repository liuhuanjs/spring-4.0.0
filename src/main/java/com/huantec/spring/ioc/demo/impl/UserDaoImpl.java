package com.huantec.spring.ioc.demo.impl;

import com.huantec.spring.ioc.demo.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author liuhuan 2018-09-09
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save user ok !");
    }
}
