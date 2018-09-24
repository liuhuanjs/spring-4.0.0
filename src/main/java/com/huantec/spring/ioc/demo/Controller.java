package com.huantec.spring.ioc.demo;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Properties;

/**
 * @author liuhuan 2018-09-24
 */
@Component(value = "controller")
public class Controller {

    @Resource(name = "userService")
    UserService userService;

    Properties testProperties;

    UserDao userDao;

    private String userName;
    private String language;
    private String oxx;

    public void start() {
        System.out.println("user name : " + userName);
        System.out.println("user language : " + language);
        System.out.println("user oxx : " + oxx);
        System.out.println(userService.getUserList());
        System.out.println("testProperties : " + testProperties);

        userDao.save();

    }

    public Properties getTestProperties() {
        return testProperties;
    }

    public void setTestProperties(Properties testProperties) {
        this.testProperties = testProperties;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setOxx(String oxx) {
        this.oxx = oxx;
    }
}
