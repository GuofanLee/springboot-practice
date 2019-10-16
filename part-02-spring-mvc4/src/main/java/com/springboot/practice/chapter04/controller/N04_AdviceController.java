package com.springboot.practice.chapter04.controller;

import com.springboot.practice.chapter04.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-10-16 21:23
 */
@Controller
public class N04_AdviceController {

    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg, DemoObj obj) {
        throw new IllegalArgumentException("非常抱歉，参数有误！来自 @Attribute: " + msg);
    }

}
