package com.aop;

import com.service.TestAop;
import com.service.impl.TestAopImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Evilina on 2016/9/6.
 */
public class TestAop2 {
    @Test
    public void testAop() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-aop.xml");
        TestAop testAop = (TestAop) applicationContext.getBean("aopImpl");
        testAop.sayLog();
    }
}
