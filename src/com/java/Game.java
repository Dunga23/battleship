package com.java;

import java.io.IOException;

public class Game {
    Player playerOne;
    Randombot playerTwo;

    public Game(Player playerOne, Randombot playerTwo){
        this.playerOne=playerOne;
        this.playerTwo=playerTwo;
    }
    public void startGame() {
        Display display =new Display();
        while (true){
            display.displayMap(playerOne.getMap());
            display.displayRadar(playerOne.getRadar());
            if (playerOne.shoot()){
                System.out.println("Попадание");
                continue;
            }
            while (true){
                if (playerTwo.shoot()){
                    System.out.println("Наш корабль атакован");
                } else{ break;}
            }
        }
    }}
