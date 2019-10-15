package com.springboot.practice.chapter03.n06_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-10-15 19:52
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("dev")
public class DemoBeanIntegerationTests {

    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject() {
        System.out.println(testBean.getContent());
    }

}
