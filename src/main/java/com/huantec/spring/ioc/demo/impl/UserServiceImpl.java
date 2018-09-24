package com.huantec.spring.ioc.demo.impl;

import com.huantec.spring.ioc.demo.UserDao;
import com.huantec.spring.ioc.demo.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuhuan 2018-09-09
 */

@Component(value = "userService")
//组件注解等同于配置文件的<bean id="userService" class="com.huantec.spring.ioc.demo.impl.UserServiceImpl"
public class UserServiceImpl implements UserService {

    @Value(value = "liuh")
    //注入默认值
    private String name;

//    @Autowired
//    // 按照类型注入，在容器中寻找实现类并进行装配
//    private UserDao userDao;

//    @Autowired
//    @Qualifier(value = "userDao")
//    //按照id注入(推荐，精准)
//    private UserDao userDao;



    @Resource(name = "userDao")
    // java注解，(推荐，精准，简单)按照这里的name去查找ac中的id进行注入
    public UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void init() {
        System.out.println("UserServiceImpl init ...");
    }

    private void close() {
        System.out.println("UserServiceImpl close ...");
    }

    public void saveUser(String name) {
        userDao.save();
    }

    public List<String> getUserNameByIds(String... names) {
        ArrayList<String> list = new ArrayList<>();
        for (String name : names) {
            list.add(name);
        }
        return list;
    }

    @Override
    public List<String> getUserList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("huantec");
        list.add("heshuguang");
        return list;
    }
}
