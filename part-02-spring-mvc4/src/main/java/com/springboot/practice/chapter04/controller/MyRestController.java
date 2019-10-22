package com.springboot.practice.chapter04.controller;

import com.springboot.practice.chapter04.service.DemoTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-10-22 14:14
 */
@RestController
public class MyRestController {

    @Autowired
    private DemoTestService demoTestService;

    @RequestMapping(value = "/testRest", produces = "text/plain;charset=UTF-8")
    public String testRest() {
        return demoTestService.saySomething();
    }

}
