package com.ngk.learn_spring_framework;

import com.ngk.learn_spring_framework.game.GameRunner;
import com.ngk.learn_spring_framework.game.MarioGame;
import com.ngk.learn_spring_framework.game.Pacman;
import com.ngk.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var pacmanGame = new Pacman();
		var gameRunner = new GameRunner(pacmanGame);
		gameRunner.run();

	}

}
