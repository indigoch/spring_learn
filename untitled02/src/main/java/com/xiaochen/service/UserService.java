package com.xiaochen.service;

import com.xiaochen.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author en
 * @Date 2021/7/3 11:12
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public void add(){
        System.out.println("service add ...");
        userDao.add();
    }
}
