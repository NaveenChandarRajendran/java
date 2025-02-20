package com.ngk.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03SpringGamingBasic {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			context.getBean(GameConsole.class).up();

			context.getBean(GameRunner.class).run();
		};
	}

}
