package com.example.demo;


import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;
import com.example.demo.game.PacmanGame;
import com.example.demo.game.SuperContraGame;

public class AppGamingBasicClass {

	public static void main(String[] args) {
		//var game = new SuperContraGame();
		//var game = new MarioGame();
		var game = new PacmanGame();

		var gameRunner = new GameRunner(game);//obj creation + wiring of dependencies
		//game is a dependency of gameRunner
		gameRunner.run();
	}

}
