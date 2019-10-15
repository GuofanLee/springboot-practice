package com.springboot.practice.chapter03.n05_annotation;

import org.springframework.stereotype.Service;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-10-15 17:16
 */
@Service
public class DemoService {

    public void outputResult() {
        System.out.println("从组合注解照样获得的Bean");
    }

}
