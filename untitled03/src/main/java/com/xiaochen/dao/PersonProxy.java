package com.xiaochen.dao;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author en
 * @Date 2021/7/5 11:27
 */
@Component
@Aspect
@Order(2)
public class PersonProxy {
    @Around(value = "execution(* com.xiaochen.dao.UserDaoImpl.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Person Around before...");
        proceedingJoinPoint.proceed();
        System.out.println("Person Around after...");
    }
}
