package com.example.demo.game;

public class MarioGame implements IGamingConsole{
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("into hole");
    }
    public void left(){
        System.out.println("back");
    }
    public void right(){
        System.out.println("forward");
    }
}
