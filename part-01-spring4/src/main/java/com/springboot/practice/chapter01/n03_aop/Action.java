package com.springboot.practice.chapter01.n03_aop;

import java.lang.annotation.*;

/**
 * 基于注解拦截
 *
 * @author GuofanLee
 * @date 2019-09-24 14:18
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Action {

    String name();

}
