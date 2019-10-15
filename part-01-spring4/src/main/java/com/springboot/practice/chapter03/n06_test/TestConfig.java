package com.springboot.practice.chapter03.n06_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-10-15 19:47
 */
@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean() {
        return new TestBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean() {
        return new TestBean("from production profile");
    }

}
