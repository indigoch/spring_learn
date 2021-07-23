package com.xiaochen.service;

import org.springframework.stereotype.Service;

/**
 * @Author en
 * @Date 2021/7/2 23:14
 */
//可以不写value,默认是类名第一个字母小写
@Service(value = "userService1")
public class UserService1 {
    public void add(){
        System.out.println("注解的add");
    }
}
