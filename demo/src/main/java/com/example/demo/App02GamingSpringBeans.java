package com.example.demo;


import com.example.demo.game.GameRunner;
import com.example.demo.game.IGamingConsole;
import com.example.demo.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingSpringBeans {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		context.getBean(IGamingConsole.class).up();
		context.getBean(GameRunner.class).run();

	}

}
