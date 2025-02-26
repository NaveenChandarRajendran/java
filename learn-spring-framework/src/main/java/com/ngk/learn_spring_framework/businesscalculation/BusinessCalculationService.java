package com.ngk.learn_spring_framework.businesscalculation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.ngk.learn_spring_framework.businesscalculation") 
public class BusinessCalculationService {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context = new AnnotationConfigApplicationContext(BusinessCalculationService.class)){
			System.out.println(context.getBean(CalculationLogic.class).findMax());
			
		};
		
	}

}
