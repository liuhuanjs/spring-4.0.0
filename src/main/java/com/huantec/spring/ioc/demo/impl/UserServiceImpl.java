package com.huantec.spring.ioc.demo.impl;

import com.huantec.spring.ioc.demo.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuhuan 2018-09-09
 */
public class UserServiceImpl implements UserService {

    private String name;

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
