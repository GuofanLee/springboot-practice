package com.springboot.practice.chapter04.controller;

import com.springboot.practice.chapter04.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-10-16 17:28
 */
@RestController
@RequestMapping("rest")
public class N03_DemoRestController {

    /**
     * 以 Json 格式返回对象：http://localhost:8080/rest/getJson?id=1&name=liguofan
     * produces 支持数组和单个字符串形式
     */
    @RequestMapping(value = "getJson", produces = {"application/json;charset=UTF-8"})
    public DemoObj getJson(DemoObj obj) {
        return new DemoObj(obj.getId() + 1, obj.getName() + "ABC");
    }

    /**
     * 已 Xml 格式返回对象：http://localhost:8080/rest/getXml?id=1&name=liguofan
     */
    @RequestMapping(value = "getXml", produces = "application/xml;charset=UTF-8")
    public DemoObj getXml(DemoObj obj) {
        return new DemoObj(obj.getId() + 1, obj.getName() + "ABC");
    }

}
