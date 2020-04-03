package org.javaboy.properites;

import org.javaboy.properites.entity.Book;
import org.javaboy.properites.entity.Student;
import org.javaboy.properites.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProperitesApplicationTests {
	@Autowired
	User user;

	@Autowired
	Book book;

	@Autowired
	Student student;
	@Test
	public void contextLoads() {
        System.out.println(user);
		System.out.println(book);
		System.out.println(student);
	}

}
