package com.hz.spring.an01.valuesetter;

/**
 * @Component:创建对象的，等同于<bean></bean>的功能
 *      属性：value 就是对象的名称，也就是bean的id值
 *          value的值是唯一的，创建的对象在整个spring容器中就一个
 *      位置：在类的上面
 *
 * @Component(value = "myStudent")等同于
 * <bean id="myStudent" class="com.hz.spring.an01.Student"/>
 * 若@Component不指定value的属性值，则bean的id是类名的首字母小写。
 *
 * @Value用法
 * 需要在属性上使用注解@Value，该注解的 value 属性用于指定要注入的值。
 * 使用该注解完成属性注入时，类中无需 setter。当然，若属性有 setter，则也可将其加到 setter 上。
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Chuncy
 * @version V1.0
 * @Date: 2021/4/16 9:50
 **/
@Component(value = "studentSetValue")
public class StudentSetValue {


    private String name;

    private Integer age;

    public StudentSetValue(){
        System.out.println("==Student无参数构造方法03==");
    }

    /**
     * 也可将@Value加到Setter方法上
     * @param age
     */
    @Value("20")
    public void setAge(Integer age) {
        this.age = age;
    }
    @Value("王五")
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
