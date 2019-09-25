package com.springboot.practice.chapter01.n03_aop;

import org.springframework.stereotype.Service;

/**
 * 基于 @Action 注解拦截
 *
 * @author GuofanLee
 * @date 2019-09-25 14:37
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add() {}

}
