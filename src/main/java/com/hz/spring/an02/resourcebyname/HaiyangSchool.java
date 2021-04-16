package com.hz.spring.an02.resourcebyname;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Chuncy
 * @version V1.0
 * @Date: 2021/4/16 11:16
 **/
@Component(value = "haiyangSchool")
public class HaiyangSchool {

    @Value("海洋大学")
    private String name;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }
}
