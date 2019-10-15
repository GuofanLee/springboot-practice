package com.springboot.practice.chapter03.n05_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * 示例组合注解
 *
 * @author GuofanLee
 * @date 2019-10-15 16:41
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface ConfigurationAndComponentScan {

    String[] value() default {};

}
