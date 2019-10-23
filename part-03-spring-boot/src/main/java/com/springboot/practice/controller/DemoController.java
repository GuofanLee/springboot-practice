package com.springboot.practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-10-23 10:08
 */
@RestController
public class DemoController {

    @RequestMapping("helloWorld")
    public String helloWorld() {
        return "Hello World!";
    }

}
