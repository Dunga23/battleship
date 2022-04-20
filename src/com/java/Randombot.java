package com.java;
import java.util.Random;

public class Randombot {
    private Map map;
    private Map radar;
    public Randombot(Map map, Map radar){
        this.map = map;
        this.radar = radar;
    }
    public boolean shoot(){
        Random random = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        if (radar.isFreeEnterCell(x, y)) {
            return radar.registerShot(x, y);
        }
        shoot();
        return false;
    }
}
