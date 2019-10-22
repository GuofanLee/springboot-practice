package com.springboot.practice.chapter04.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * WebApplicationInitializer 是 Spring 提供用来配置 Servlet 3.0+ 配置的接口，从而实现了替代 web.xml 的位置
 *
 * @author GuofanLee
 * @date 2019-10-16 10:51
 */
public class WebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //新建 WebApplicationContext，注册配置类，并将其和当前 servletContext 关联
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(MyMvcConfig.class);
        context.setServletContext(servletContext);
        //注册 Spring MVC 的 DispatcherServlet
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
        //开启异步方法支持
        servlet.setAsyncSupported(true);
    }

}
