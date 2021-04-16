package com.hz.spring.an01.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Chuncy
 * @version V1.0
 * @Date: 2021/4/16 10:35
 **/
@Component
public class StudentSchool {

    @Value("张三")
    private String name;
    @Value("25")
    private Integer age;

    @Autowired
    private School school;

    @Override
    public String toString() {
        return "StudentSchool{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
