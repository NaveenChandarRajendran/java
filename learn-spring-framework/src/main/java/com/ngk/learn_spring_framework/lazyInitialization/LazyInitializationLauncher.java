package com.ngk.learn_spring_framework.lazyInitialization;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
class ClassA{
	
}

@Component
@Lazy
class ClassB{
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Lot of DEpendency Injection");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("CLass B is doing some logic");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLauncher {
	
	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(LazyInitializationLauncher.class)) {
			
			System.out.println("Context loaded successfully");
			
			context.getBean(ClassB.class).doSomething();

		}
	}
}