package com.huantec.spring.ioc.demo;

import com.huantec.spring.ioc.demo.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuhuan 2018-09-09
 */
public class UserServiceTest {

    //依赖注入
    @Test
    public void saveUser() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) ac.getBean("userService");
        userService.saveUser("liuh");
    }

    @Test
    public void getUserListBySpring() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) ac.getBean("userService");
        System.out.println("" + userService.getUserList());
        System.out.println("" + userService.getUserNameByIds("aaa", "bbb"));
        System.out.println(userService.getName());
    }

    @Test
    public void getUserList() {
        UserService userService = new UserService() {
            @Override
            public List<String> getUserList() {
                ArrayList<String> list = new ArrayList<>();
                list.add("huantec");
                list.add("heshuguang");
                return list;
            }
        };

        List<String> userList = userService.getUserList();
        System.out.printf("" + userList);
    }
}
