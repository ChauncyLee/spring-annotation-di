package com.hz.spring.an01.awandqf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Chuncy
 * @version V1.0
 * @Date: 2021/4/16 10:35
 **/
@Component(value = "studentAQ")
public class StudentSchoolAQ {

    @Value("老张")
    private String name;
    @Value("26")
    private Integer age;

    @Autowired
    @Qualifier(value = "mySchoolAQ")
    private SchoolAQ schoolAQ;

    @Override
    public String toString() {
        return "StudentSchool{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + schoolAQ +
                '}';
    }
}
