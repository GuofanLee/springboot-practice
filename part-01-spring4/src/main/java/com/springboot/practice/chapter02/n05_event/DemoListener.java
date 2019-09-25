package com.springboot.practice.chapter02.n05_event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-09-25 19:43
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("DemoListener 接受到了 DemoEvent 发布的消息：" + msg);
    }

}
