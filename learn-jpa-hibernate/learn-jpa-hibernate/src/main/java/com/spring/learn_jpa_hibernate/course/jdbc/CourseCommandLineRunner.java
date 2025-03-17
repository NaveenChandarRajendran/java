package com.spring.learn_jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.learn_jpa_hibernate.course.Course;
import com.spring.learn_jpa_hibernate.course.jpa.CourseJpaRepository;
import com.spring.learn_jpa_hibernate.course.springjpa.CourseSpringJpaRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1,"Learn Python","in28minutes"));
		repository.save(new Course(2,"Learn Devops","in28minutes"));
		repository.deleteById(1l);
		
		
		
		System.out.println(repository.findById(2l));
	}

}
