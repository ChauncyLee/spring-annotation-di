package com.hz.spring.an01;

import com.hz.spring.an01.annotest.Student;
import com.hz.spring.an01.autowired.StudentSchool;
import com.hz.spring.an01.awandqf.StudentSchoolAQ;
import com.hz.spring.an01.value.StudentValue;
import com.hz.spring.an01.valuesetter.StudentSetValue;
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

    /**
     * @Value给属性注解 自动赋值
     */
    @Test
    public void test02(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        StudentValue stu=(StudentValue) ac.getBean("studentValue");
        System.out.println(stu);
    }

    /**
     * @Value注解到Setter方法
     */
    @Test
    public void test03(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        StudentSetValue stu=(StudentSetValue) ac.getBean("studentSetValue");
        System.out.println(stu);
    }

    /**
     * byType 自动注入 @Autowired
     * 在引用属性上注解@Autowired自动获取School类型对象实例
     */
    @Test
    public void test04(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        StudentSchool stu=(StudentSchool) ac.getBean("studentSchool");
        System.out.println(stu);
    }

    /**
     * byName 自动注入 @Autowired与@Qualifier 自动获取School类型对象实例
     * 在引用属性上联合使用注解@Autowired与@Qualifier
     * @Qualifier的value属性主要用于指定要匹配的Bean的id值，类中无需set方法，也可加到set方法上
     */
    @Test
    public void test05(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        StudentSchoolAQ stu=(StudentSchoolAQ) ac.getBean("studentAQ");
        System.out.println(stu);
    }


}
