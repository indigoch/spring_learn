package com.xiaochen.service;

import com.xiaochen.dao.UserDao;

/**
 * @Author en
 * @Date 2021/7/2 20:46
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add!");
        userDao.update();
//         原始方式
//        UserDao userDao = new UserDaoImpl();
//        userDao.update();
    }
}
