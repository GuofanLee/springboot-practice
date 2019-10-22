package com.springboot.practice.chapter04.service;

import org.springframework.stereotype.Service;

/**
 * Spring MVC 测试
 *
 * @author GuofanLee
 * @date 2019-10-22 11:54
 */
@Service
public class DemoTestService {

    public String saySomething() {
        return "hello";
    }

}
