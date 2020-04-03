package org.javaboy.properites.entity;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

 /*使用方式：
    1.在属性文件中定义键值对 例如：
        student.id=
        student.name=
    2.在需要注入值得class中@Component将class注入到spring容器
    3.加上@PropertySource 指定加载的属性文件
    4.加上ConfigurationProperties(prefix = "student") prefix指明加载的属性的前缀
    5.类的属性会对应自动注入

    */
@Component
@PropertySource("classpath:student.properties")
// 类型安全的属性注入
@ConfigurationProperties(prefix = "student")
public class Student {

    private Integer id;

    private String name;

    private String classes;

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

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
