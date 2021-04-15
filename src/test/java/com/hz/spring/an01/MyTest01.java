package com.hz.spring.an01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ac= new ClassPathXmlApplicationContext(config);
        //从容器中获取对象
        Student stu=(Student)ac.getBean("myStudent");

        System.out.println("student"+stu );
    }
}