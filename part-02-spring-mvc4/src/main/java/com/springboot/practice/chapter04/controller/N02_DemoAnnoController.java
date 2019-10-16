package com.springboot.practice.chapter04.controller;

import com.springboot.practice.chapter04.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Spring MVC 常用注解
 *
 * @author GuofanLee
 * @date 2019-10-16 11:50
 */
@Controller
@RequestMapping("/anno")
public class N02_DemoAnnoController {

    @ResponseBody
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public String index(HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access";
    }

    /**
     * 接收路径参数：http://localhost:8080/anno/pathvar/liguofan
     */
    @ResponseBody
    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")
    public String demoPathVar(@PathVariable String str, HttpServletRequest request) {
        return "url: " + request.getRequestURL() + " can access, str: " + str;
    }

    /**
     * request 参数获取：http://localhost:8080/anno/requestParam?id=110
     */
    @ResponseBody
    @RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8")
    public String passRequestParam(Long id, HttpServletRequest request) {
        return "url: " + request.getRequestURL() + " can access, id: " + id;
//        return "url: " + request.getRequestURL() + " can access, id: " + request.getParameter("id");
    }

    /**
     * 将参数绑定到对象：http://localhost:8080/anno/obj?id=1001&name=liguofan
     */
    @ResponseBody
    @RequestMapping(value = "/obj", produces = "application/json;charset=UTF-8")
    public String passObj(DemoObj obj, HttpServletRequest request) {
        return "url: " + request.getRequestURL() + " can access, id: " + obj.getId() + "; name: " + obj.getName();
//        return "url: " + request.getRequestURL() + " can access, id: " + request.getParameter("id") + "; name: " + request.getParameter("name");
    }

    @ResponseBody
    @RequestMapping(value = {"/name1", "/name2"}, produces = "text/plain;charset=UTF-8")
    public String remove(HttpServletRequest request) {
        return "url: " + request.getRequestURL() + " can access";
    }

}
