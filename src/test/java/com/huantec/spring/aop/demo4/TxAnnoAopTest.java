package com.huantec.spring.aop.demo4;

import com.huantec.spring.aop.demo4.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author liuhuan 2018-09-11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:txAnno-aop.xml")
public class TxAnnoAopTest {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void run1() {
        accountService.pay("liuh", "hxx", 10);
    }
}
