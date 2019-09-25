package com.springboot.practice.chapter02.n03_prepost;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-09-25 17:45
 */
public class BeanWayService {

    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("构造函数-BeanWayService");
    }

    public void destroy() {
        System.out.println("@Bean-destroy-method");
    }

}
