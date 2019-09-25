package com.springboot.practice.chapter02.n03_prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-09-25 17:53
 */
@Configuration
@ComponentScan("com.springboot.practice.chapter02.n03_prepost")
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }

}
