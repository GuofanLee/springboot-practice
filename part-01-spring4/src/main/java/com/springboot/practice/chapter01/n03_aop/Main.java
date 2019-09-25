package com.springboot.practice.chapter01.n03_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-09-25 15:10
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }

}
