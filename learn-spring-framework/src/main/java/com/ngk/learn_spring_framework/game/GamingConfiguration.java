package com.ngk.learn_spring_framework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GameConsole game() {
		var game = new Pacman();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GameConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
	
//	var marioGame = new MarioGame();
//	var superContraGame = new SuperContraGame();
//	var pacmanGame = new Pacman();
//	var gameRunner = new GameRunner(pacmanGame);
//	gameRunner.run();
}
