package com.java;
public class Main{
    public static void main(String[] args){
        Map mapOne=new Map();
        Map mapTwo=new Map();
        Player playerOne=new Player("Player",mapOne,mapTwo);
        Randombot playerTwo=new Randombot(mapTwo,mapOne);
        Game gameSession=new Game(playerOne,playerTwo);
        gameSession.startGame();
    }
}
