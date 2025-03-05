package com.javaLearn.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Courses {
	
	@RequestMapping("/courses")
	public List<Course> getCourseList(){
		return Arrays.asList(
					new Course(1,"Learn AWS","in28minutes"),
					new Course(2,"Learn Devops","in28minutes")
				);
	}

}
