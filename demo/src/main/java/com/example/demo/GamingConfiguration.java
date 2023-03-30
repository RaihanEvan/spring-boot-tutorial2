package com.example.demo;

import com.example.demo.game.GameRunner;
import com.example.demo.game.IGamingConsole;
import com.example.demo.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class GamingConfiguration {
    @Bean
    public IGamingConsole game(){
        var game = new PacmanGame();
        return game;
    }
    @Bean
    public GameRunner gameRunner(IGamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

}
