package com.chen.service;

import com.chen.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author en
 * @Date 2021/7/22 20:34
 */
@Service
@Transactional //开启事务
public class UserService {
    @Autowired
    private UserDao userDao;
    public void accountMoney() {
        userDao.addMoney();
        userDao.reduceMoney();
    }
}
