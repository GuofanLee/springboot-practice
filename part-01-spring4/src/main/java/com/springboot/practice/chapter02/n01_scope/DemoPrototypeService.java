package com.springboot.practice.chapter02.n01_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 指定 Bean 的作用域为 Prototype
 *
 * @author GuofanLee
 * @date 2019-09-25 15:48
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
