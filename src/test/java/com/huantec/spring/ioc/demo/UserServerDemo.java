package com.huantec.spring.ioc.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liuhuan 2018-09-24
 */
public class UserServerDemo {


    public static void main(String[] args) {
        //       init ac
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:ioc-SpEL.xml");
        ac.registerShutdownHook(); //jvm 退出时触发cxt关闭
        ac.start();

        Controller controller = (Controller) ac.getBean("controller");
        controller.start();

    }
}
