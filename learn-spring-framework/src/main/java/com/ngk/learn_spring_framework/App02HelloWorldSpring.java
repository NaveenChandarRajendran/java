package com.ngk.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ngk.learn_spring_framework.game.GameRunner;
import com.ngk.learn_spring_framework.game.MarioGame;
import com.ngk.learn_spring_framework.game.Pacman;
import com.ngk.learn_spring_framework.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// Retrieve the bean from the Spring context
        String message = context.getBean(String.class);
        System.out.println(message); // Should print "Hello, World!"

        // Close the context to release resources
        context.close();

	}

}
