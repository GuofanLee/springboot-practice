package com.springboot.practice.chapter02.n02_el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-09-25 16:19
 */
@Configuration
@ComponentScan("com.springboot.practice.chapter02.n02_el")
@PropertySource("classpath:com/springboot/practice/chapter02/n02_el/test.properties")
public class ElConfig {

    @Value("注入普通字符串")
    private String normal;

    /**
     * 注入操作系统属性
     */
    @Value("#{systemProperties['os.name']}")
    private String osName;

    /**
     * 注入表达式结果
     */
    @Value("#{T(java.lang.Math).random() * 100.0}")
    private String randomNumber;

    /**
     * 注入其他 Bean 属性
     */
    @Value("#{demoService.another}")
    private String fromAnother;

    /**
     * 注入文件资源
     */
    @Value("classpath:com/springboot/practice/chapter02/n02_el/test.txt")
    private Resource testFile;

    /**
     * 注入 URL 资源
     */
    @Value("http://www.baidu.com")
    private Resource testUrl;

    /**
     * 注入属性文件中的值
     */
    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment envirorment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);

            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(envirorment.getProperty("book.author"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
