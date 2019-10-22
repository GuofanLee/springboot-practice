package com.springboot.practice.chapter04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 基于 SSE(Server Send Event) 的服务器端推送技术
 *
 * @author GuofanLee
 * @date 2019-10-22 09:53
 */
@Controller
public class SseController {

    /**
     * 每5秒钟向浏览器推送随机消息
     * 这里使用输出的媒体类型为 text/event-stream，这是服务器端 SSE 的支持
     */
    @ResponseBody
    @RequestMapping(value = "/push", produces = "text/event-stream")
    public String push() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Random r = new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //必须以data:开头，data:后为实际的数据
        return "data:" + dateFormat.format(new Date()) + "\n\n";
    }

}
