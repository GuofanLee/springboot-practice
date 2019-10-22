package com.springboot.practice.chapter04.controller;

import com.springboot.practice.chapter04.service.DemoTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-10-22 14:12
 */
@Controller
public class NormalController {

    @Autowired
    private DemoTestService demoTestService;

    @RequestMapping("normal")
    public String testPage(Model model) {
        model.addAttribute("msg", demoTestService.saySomething());
        return "page";

    }

}
