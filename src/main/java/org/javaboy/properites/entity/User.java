package org.javaboy.properites.entity;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
// 直接在application.properties中配置，项目直接会加载此文件
@Component
public class User {

    @Value("${user.id}")
    private Integer id;
    @Value("${user.username}")
    private String name;
    @Value("${user.age}")
    private String age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
