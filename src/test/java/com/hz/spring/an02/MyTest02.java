package com.hz.spring.an02;

import com.hz.spring.an02.resourcebyname.HaiyangStudent;
import com.hz.spring.an02.resourcebytype.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Chuncy
 * @version V1.0
 * @Date: 2021/4/16 9:53
 **/
public class MyTest02 {

    /**
     * 默认按名注入，按名称不能注入bean，则会按类型名称进行bean的匹配注入
     */
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Student stu=(Student) ac.getBean("beijingStudent");
        System.out.println(stu);
    }

    /**
     * 默认按名注入，按名称不能注入bean，则会按类型名称进行bean的匹配注入
     */
    @Test
    public void test02(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        HaiyangStudent stu=(HaiyangStudent) ac.getBean("haiyangStudent");
        System.out.println(stu);
    }

}
