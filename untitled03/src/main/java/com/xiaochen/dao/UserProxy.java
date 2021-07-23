package com.xiaochen.dao;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author en
 * @Date 2021/7/5 10:36
 */
@Component
@Aspect
@Order(1)
public class UserProxy {
    //公共切入点抽取
    @Pointcut(value = "execution(* com.xiaochen.dao.UserDaoImpl.add(..))")
    public void pointcut(){
    }
    @Before(value = "pointcut()")
    public void before(){
        System.out.println("Before...");
    }
    @After(value = "pointcut()")
    public void after(){
        System.out.println("After...");
    }
    @AfterReturning(value = "pointcut()")
    public void afterReturning(){
        System.out.println("AfterReturning...");
    }
    @AfterThrowing(value = "pointcut()")
    public void afterThrowing(){
        System.out.println("AfterThrowing...");
    }
    @Around(value = "pointcut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around before...");
        proceedingJoinPoint.proceed();
        System.out.println("Around after...");
    }
}
