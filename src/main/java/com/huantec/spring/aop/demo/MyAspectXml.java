package com.huantec.spring.aop.demo;

/**
 * 切面类，执行前记录日志信息
 *
 * @author liuhuan 2018-09-09
 */
public class MyAspectXml {
    /**
     * 定义Advice(通知增强)
     */
    public void log() {
        System.out.println("记录日志 ... ");
    }
}
