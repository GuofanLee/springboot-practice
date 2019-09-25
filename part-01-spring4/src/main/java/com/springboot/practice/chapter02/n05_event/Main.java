package com.springboot.practice.chapter02.n05_event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-09-25 19:50
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("Hello Application Event");
        context.close();
    }

}
