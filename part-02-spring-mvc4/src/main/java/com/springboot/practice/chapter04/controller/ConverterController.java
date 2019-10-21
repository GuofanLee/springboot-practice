package com.springboot.practice.chapter04.controller;

import com.springboot.practice.chapter04.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-10-21 19:53
 */
@Controller
public class ConverterController {

    /**
     * 指定返回的媒体类型为自定义的媒体类型 application/x-GuofanLee
     */
    @ResponseBody
    @RequestMapping(value = "/convert", produces = {"application/x-GuofanLee"})
    public DemoObj convert(@RequestBody DemoObj demoObj) {
        return demoObj;
    }

}
