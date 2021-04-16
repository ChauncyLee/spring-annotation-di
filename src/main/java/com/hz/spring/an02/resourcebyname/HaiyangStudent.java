package com.hz.spring.an02.resourcebyname;

/**
 * Spring提供了对 jdk中@Resource注解的支持。@Resource 注解既可以按名称匹配Bean，
 * 也可以按类型匹配 Bean。默认是按名称注入。使用该注解，要求 JDK 必须是 6 及以上版本。
 * @Resource 可在属性上，也可在 set 方法上。
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Chuncy
 * @version V1.0
 * @Date: 2021/4/16 11:14
 **/
@Component("haiyangStudent")
public class HaiyangStudent {

    @Value("小海")
    private String name;
    @Value("26")
    private Integer age;

    /**
     * 默认按名注入，按名称不能注入bean，则会按类型名称进行bean的匹配注入
     */
    @Resource(name = "haiyangSchool")
    private HaiyangSchool haiyangSchool;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + haiyangSchool +
                '}';
    }
}
