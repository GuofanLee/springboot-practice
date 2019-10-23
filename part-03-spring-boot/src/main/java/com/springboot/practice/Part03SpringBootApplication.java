package com.springboot.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication/*(exclude = {DataSourceAutoConfiguration.class}关闭特定功能的自动配置)*/
public class Part03SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Part03SpringBootApplication.class, args);
    }

}
