package com.huantec.spring.aop.demo6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liuh 2018-09-27
 * @version 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aop-demo6.xml")
public class MyXmlServiceTest {
    @Autowired
    private MyXmlService myXmlService;

    @Test
    public void run() {
        myXmlService.handlerXml("huan", 18);
    }
}

