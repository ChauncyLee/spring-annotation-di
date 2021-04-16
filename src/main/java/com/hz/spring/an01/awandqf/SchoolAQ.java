package com.hz.spring.an01.awandqf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Chuncy
 * @version V1.0
 * @Date: 2021/4/16 10:35
 **/
@Component("mySchoolAQ")
public class SchoolAQ {

    @Value("人民大学")
    private String name;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }
}
