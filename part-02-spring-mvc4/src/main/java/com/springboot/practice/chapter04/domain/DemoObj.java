package com.springboot.practice.chapter04.domain;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-10-16 11:45
 */
public class DemoObj {

    private Long id;

    private String name;

    public DemoObj() {
    }

    public DemoObj(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
