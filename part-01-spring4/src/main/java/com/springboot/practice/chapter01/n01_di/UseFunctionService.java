package com.springboot.practice.chapter01.n01_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-09-24 11:19
 */
@Service
public class UseFunctionService {

    @Autowired
    private FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }

}
