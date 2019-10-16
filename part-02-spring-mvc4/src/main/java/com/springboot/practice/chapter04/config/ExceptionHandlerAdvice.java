package com.springboot.practice.chapter04.config;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ControllerAdvice Controller通知
 *
 * @author GuofanLee
 * @date 2019-10-16 19:59
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {

    /**
     * @ExceptionHandler 用来定义全局异常处理，value 属性定义拦截条件
     */
    @ExceptionHandler(Exception.class)
    public ModelAndView exception(Exception exception, WebRequest request) {
        //error页面
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage", exception.getMessage());
        return modelAndView;
    }

    /**
     * @ModelAttribute 注解将键值对添加到全局，所有注解了 @RequestMapping 的方法都可获得此键值对
     */
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("msg", "额外信息");
    }

    /**
     * 通过 @InitBinder 注解定制 WebDataBinder
     */
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.setDisallowedFields("id");
    }

}
