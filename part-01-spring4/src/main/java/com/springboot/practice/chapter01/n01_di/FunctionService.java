package com.springboot.practice.chapter01.n01_di;

import org.springframework.stereotype.Service;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-09-24 11:15
 */
@Service
public class FunctionService {

    public String sayHello(String word) {
        return "Hello " + word + "!";
    }

}
