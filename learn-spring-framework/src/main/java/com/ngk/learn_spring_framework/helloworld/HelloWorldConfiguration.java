package com.ngk.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {};

@Configuration
public class HelloWorldConfiguration {
	
	 @Bean
	 public String helloWorld() {
		 return "Hello, World!";
	 }
	 
	 @Bean
	 public String name() {
		 return "Naveen";
	 }
	 
	 @Bean
	 public int age() {
		 return 23;
	 }
	 
	 @Bean
	 public Person person() {
		 return new Person("Vignesh",27);
	 };
	 
	 @Bean
	 public Person person2MethodCall() {
		 return new Person(name(),age());
	 };

}
