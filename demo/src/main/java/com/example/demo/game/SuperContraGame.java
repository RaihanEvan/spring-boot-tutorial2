package com.example.demo.game;

public class SuperContraGame implements IGamingConsole{
    public void up(){
        System.out.println("Up");
    }
    public void down(){
        System.out.println("Crouch");
    }
    public void left(){
        System.out.println("Left");
    }
    public void right(){ System.out.println("Shoot");}
}
