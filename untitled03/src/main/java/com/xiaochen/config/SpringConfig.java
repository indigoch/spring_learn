package com.xiaochen.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author en
 * @Date 2021/7/5 10:55
 */
@Configuration
@ComponentScan(basePackages = {"com.xiaochen"})
@EnableAspectJAutoProxy
public class SpringConfig {
}
