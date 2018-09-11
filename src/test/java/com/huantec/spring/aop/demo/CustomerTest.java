package com.huantec.spring.aop.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author liuhuan 2018-09-09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-aop.xml")
public class CustomerTest {

    @Resource(name = "customerDao")
    private CustomerDao customerDao;

    @Test
    public void save() {
        customerDao.save();
    }
}
