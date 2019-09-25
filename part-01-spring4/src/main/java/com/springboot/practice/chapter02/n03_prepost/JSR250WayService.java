package com.springboot.practice.chapter02.n03_prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-09-25 17:48
 */
public class JSR250WayService {

    /**
     * 在构造方法执行完之后执行
     */
    @PostConstruct
    public void init() {
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("构造函数-JSR250WayService");
    }

    /**
     * 在 Bean 销毁之前执行
     */
    @PreDestroy
    public void destroy() {
        System.out.println("jsr250-destroy-method");
    }

}
