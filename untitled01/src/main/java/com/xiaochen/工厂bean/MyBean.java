package com.xiaochen.工厂bean;

import com.xiaochen.内部bean.Dept;
import com.xiaochen.内部bean.Emp;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author en
 * @Date 2021/7/2 21:54
 */
public class MyBean implements FactoryBean<Emp> {


    //    更改返回类型
    //    定义类型和返回类型可以不一样
    @Override
    public Emp getObject() throws Exception {
        Dept dept = new Dept();
        dept.setDname("销售部");
        Emp emp = new Emp();
        emp.setDept(dept);
        emp.setEname("luck");
        emp.setGender("女");
        return emp;

    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
