package com.springboot.practice.chapter04.controller;

import com.springboot.practice.chapter04.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-10-22 11:16
 */
@Controller
public class AsyncController {

    @Autowired
    PushService pushService;

    @ResponseBody
    @RequestMapping("/defer")
    public DeferredResult<String> deferredCall() {
        return pushService.getAsyncUpdate();
    }

}
