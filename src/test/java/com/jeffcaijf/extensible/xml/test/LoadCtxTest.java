package com.jeffcaijf.extensible.xml.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jeff on 6/5/16.
 */
public class LoadCtxTest {

    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-test-dateformat-ctx.xml");

    @Test
    public void loadCtx() {
//        Assert.assertNotNull(applicationContext.getBean("jobDetailTemplate"));
    }
}
