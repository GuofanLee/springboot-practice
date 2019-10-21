package com.springboot.practice.chapter04.domain;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 自定义 HttpMessageConverter
 *
 * @author GuofanLee
 * @date 2019-10-21 19:28
 */
public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {

    /**
     * 自定义媒体类型：application/x-GuofanLee
     */
    public MyMessageConverter() {
        super(new MediaType("application", "x-GuofanLee", StandardCharsets.UTF_8));
    }

    /**
     * 表明本 HttpMessageConverter 只处理 DemoObj 这个类
     */
    @Override
    protected boolean supports(Class<?> aClass) {
        return DemoObj.class.isAssignableFrom(aClass);
    }

    /**
     * 重写 readInternal 方法，处理请求的数据。代码表明我们处理由“-”隔开的数据，并转成 DemoObj 的对象
     */
    @Override
    protected DemoObj readInternal(Class<? extends DemoObj> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        String temp = StreamUtils.copyToString(httpInputMessage.getBody(), StandardCharsets.UTF_8);
        String[] tempArr = temp.split("-");
        return new DemoObj(new Long(tempArr[0]), tempArr[1]);
    }

    /**
     * 重写 writeInternal，处理如何输出数据到 response。此例中，我们在原样输出前面加上“hello:”
     */
    @Override
    protected void writeInternal(DemoObj obj, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        String out = "hello:" + obj.getId() + "-" + obj.getName();
        httpOutputMessage.getBody().write(out.getBytes());
    }

}
