package com.springboot.practice.chapter02.n02_el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-09-25 16:16
 */
@Service
public class DemoService {

    @Value("注入普通字符串")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }

}
