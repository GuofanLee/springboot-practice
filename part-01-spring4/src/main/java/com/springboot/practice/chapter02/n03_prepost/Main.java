package com.springboot.practice.chapter02.n03_prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-09-25 17:57
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        context.getBean(BeanWayService.class);
        context.getBean(JSR250WayService.class);
        context.close();
    }

}
