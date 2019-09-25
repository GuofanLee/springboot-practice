package com.springboot.practice.chapter02.n05_event;

import org.springframework.context.ApplicationEvent;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-09-25 19:40
 */
public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
