package com.springboot.practice.chapter01.n03_aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-09-25 15:09
 */
@Configuration
@ComponentScan("com.springboot.practice.chapter01.n03_aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
