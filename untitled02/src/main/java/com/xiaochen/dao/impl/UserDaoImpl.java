package com.xiaochen.dao.impl;

import com.xiaochen.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Author en
 * @Date 2021/7/3 11:09
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("add....");
    }
}
