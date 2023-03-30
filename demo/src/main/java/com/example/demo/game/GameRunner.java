package com.example.demo.game;

public class GameRunner {
    //MarioGame game;
    //SuperContraGame game;
    //Have to again give GameRunner the newly created feature game for each new added game!! so hectic....thats tightly coupled
//    public GameRunner(MarioGame game) {
//        this.game = game;
//    }
//    public GameRunner(SuperContraGame game) {
//        this.game = game;
//    }
    IGamingConsole game;

    public GameRunner(IGamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: "+game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
