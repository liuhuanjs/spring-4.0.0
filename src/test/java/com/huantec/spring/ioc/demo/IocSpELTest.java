package com.huantec.spring.ioc.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author liuhuan 2018-09-24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ioc-SpEL.xml")
public class IocSpELTest {
    @Resource(name = "controller")
    private Controller controller;

    @Test
    public void run() {
        controller.start();
    }
}
