package com.huantec.spring.aop.demo6;

/**
 * @author liuh 2018-09-26
 * @version 1.0.0
 */
public class MyXmlServiceImpl implements MyXmlService {


    public String handlerXml(String name, int age) {
//        int a = 1 / 0; //异常通知模拟
        System.out.println("name : "+name+"  age : " +age+ "  调用 MyXmlServiceImpl");
        return name;
    }


}

