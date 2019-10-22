package com.springboot.practice.chapter04;

import com.springboot.practice.chapter04.config.MyMvcConfig;
import com.springboot.practice.chapter04.service.DemoTestService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @WebAppConfiguration 注解在类上，用来声明加载的 ApplicationContex 是一个 WebApplicationContext。
 * 它的属性指定的是 Web 资源的位置，默认为 src/main/webapp，本例修改为 src/main/resources
 *
 * @author GuofanLee
 * @date 2019-10-22 11:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyMvcConfig.class})
@WebAppConfiguration("src/main/resource")
public class TestControllerIntegrationTests {

    /**
     * MockMvc-模拟MVC对象
     * 通过 MockMvcBuilders.webAppContextSetup(this.applicationContext).build() 初始化
     */
    private MockMvc mockMvc;

    /**
     * 可以在测试用例中注入Spring的Bean
     */
    @Autowired
    private DemoTestService demoTestService;

    /**
     * 可注入WebApplicationContext
     */
    @Autowired
    private WebApplicationContext applicationContext;

    /**
     * 可注入模拟的http session，此处仅作演示，没有使用
     */
    @Autowired
    private MockHttpSession session;

    /**
     * 可注入模拟的http request，此处仅作演示，没有使用
     */
    @Autowired
    private MockHttpServletRequest request;

    /**
     * @Before 在测试开始前进行的初始化工作
     */
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.applicationContext).build();
    }

    @Test
    public void testNormalController() throws Exception {
        mockMvc.perform(get("/normal"))     //模拟向/normal进行get请求
                .andExpect(status().isOk())              //预期控制返回状态为200
                .andExpect(view().name("page"))     //预期view的名称为page
                .andExpect(forwardedUrl("/WEB-INF/classes/views/page.jsp"))           //预期页面转向的真正路径为/WEB-INF/classes/views/page.jsp
                .andExpect(model().attribute("msg", demoTestService.saySomething()));       //预期model里的值是demoService.saySomething（）返回值hello
    }

    @Test
    public void testRestController() throws Exception {
        mockMvc.perform(get("/testRest"))       //模拟向/testRest进行get请求
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/plain;charset=UTF-8"))       //预期返回值的媒体类型为text/plain；charset=UTF-8
                .andExpect(content().string(demoTestService.saySomething()));       //预期返回值的内容为demoService.saySomething（）返回值hello
    }

}
