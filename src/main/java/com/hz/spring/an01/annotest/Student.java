package com.hz.spring.an01.annotest;

import org.springframework.stereotype.Component;

/**
 * @Component:创建对象的，等同于<bean></bean>的功能
 *      属性：value 就是对象的名称，也就是bean的id值
 *          value的值是唯一的，创建的对象在整个spring容器中就一个
 *      位置：在类的上面
 *
 * @Component(value = "myStudent")等同于
 * <bean id="myStudent" class="com.hz.spring.an01.Student"/>
 *
 * 若@Component不指定value的属性值，则bean的id是类名的首字母小写。
 */
/**
 * @author Chuncy
 * @version V1.0
 * @Date: 2021/4/16 9:49
 **/
@Component(value = "myStudent")
public class Student {
    private String name;
    private Integer age;

    public Student(){
        System.out.println("==Student无参数构造方法01==");
    }


    public void setAge(Integer age) {
        this.age = age;
    }

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
