package com.ngk.learn_spring_framework.game;

public class GameRunner {
//	MarioGame game;
	GameConsole game;
	
	public GameRunner(GameConsole game) {
		this.game = game;
	}
	
	public void run(){
		game.up();
		game.down();
		game.right();
		game.left();
	}

}
