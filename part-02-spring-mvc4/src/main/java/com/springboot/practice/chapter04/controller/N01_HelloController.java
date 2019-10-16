package com.springboot.practice.chapter04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-10-16 11:07
 */
@Controller
public class N01_HelloController {

    @RequestMapping("/index")
    public String hello() {
        return "index";
    }

}
