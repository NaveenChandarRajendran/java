package com.ngk.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

}
