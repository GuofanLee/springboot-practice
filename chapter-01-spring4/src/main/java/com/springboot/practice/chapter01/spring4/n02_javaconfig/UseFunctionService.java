package com.springboot.practice.chapter01.spring4.n02_javaconfig;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-09-24 11:42
 */
public class UseFunctionService {

    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }

}
