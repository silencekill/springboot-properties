package org.javaboy.properites.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

// 首先注册到spring容器中
@Component
//项目不会自动加载此文件
//相当于引入自定义的属性文件文件进行加载
//属于sprig的注解，在spring项目中也可以使用
@PropertySource("classpath:book.properties")
public class Book {

    @Value("${book.id}")
    private Integer id;
    @Value("${book.name}")
    private String name;
    @Value("${book.author}")
    private String author;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
