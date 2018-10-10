package com.huantec.spring.aop.demo6;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类，执行前记录日志信息
 *
 * @author liuhuan 2018-09-09
 */
public class MyXmlServiceAop {

//    public void beforeHandler() {
//        System.out.println("前置通知:空参");
//    }

    public void beforeHandler(String name, int age) {
        System.out.println("前置通知:" + "[ name="+name + " ,age=" + age+" ]");
    }


    public void aroundHandler(ProceedingJoinPoint jointPoint) {
        try {
            System.out.println("环绕通知开始");
            String name = (String) jointPoint.proceed();
            jointPoint.proceed();
            System.out.println(name + "环绕通知结束");
        } catch (Throwable e) {
        }
    }

    public void afterHandler() {
        System.out.println("后置通知");
    }

    public void returnHandler(Object name) {
        //在返回通知中获取返回值
        System.out.println("返回通知:" + name);
    }

    public void throwExceptionHandler(Throwable ex) {
        System.out.println("异常通知:" + ex.getMessage());
    }
}
