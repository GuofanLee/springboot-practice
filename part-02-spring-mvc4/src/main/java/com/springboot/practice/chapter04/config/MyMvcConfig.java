package com.springboot.practice.chapter04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-10-16 10:32
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.springboot.practice.chapter04")
public class MyMvcConfig {

    /**
     * 配置 ViewResolver
     */
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        //编译后的目录
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

}
