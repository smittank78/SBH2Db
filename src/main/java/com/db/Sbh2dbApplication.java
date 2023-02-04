package com.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Sbh2dbApplication {

	int count =1;
	@Autowired
	StudentRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(Sbh2dbApplication.class, args);
	}
	
	@GetMapping("/add")
	public Student addStudent() 
	{
		System.out.println("adding student : " + count);
		Student student = new Student(1,"smit",172);
		student = repo.save(student);
		count++;
		return student;
		
	}
}
