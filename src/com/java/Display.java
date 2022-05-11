package com.java;

import java.util.HashMap;
import static java.lang.System.out;
public class Display{
    private final String columns="  А Б В Г Д Е Ж З И К\n";
    private final String row="%2d %s %s %s %s %s %s %s %s %s %s\n";
    private final HashMap<Integer,String> mapSymbols=new HashMap<>(){{
        put(0," ");
        put(1,"■");
        put(2,"□");
        put(3,"X");
        put(4,"*");
    }};
    private final HashMap<Integer,String> radarSymbols=new HashMap<>(){{
        put(0," ");
        put(1," ");
        put(2,"□");
        put(3,"X");
        put(4,"*");
    }};
    public void displayMap(Map map){
        StringBuilder mapImage=new StringBuilder();
        mapImage.append(columns);
        for (int i = 0;i<map.size()[0];i++){
            mapImage.append(String.format(row,i + 1,
                    mapSymbols.get(map.getCell(i,0)), mapSymbols.get(map.getCell(i,1)),
                    mapSymbols.get(map.getCell(i,2)), mapSymbols.get(map.getCell(i,3)),
                    mapSymbols.get(map.getCell(i,4)), mapSymbols.get(map.getCell(i,5)),
                    mapSymbols.get(map.getCell(i,6)), mapSymbols.get(map.getCell(i,7)),
                    mapSymbols.get(map.getCell(i,8)), mapSymbols.get(map.getCell(i,9))));
        }
        mapImage.append("\n");
        out.print(mapImage);
    }
    public void displayRadar(Map radar){
        StringBuilder radarImage=new StringBuilder();
        radarImage.append(columns);
        for (int i=0; i<radar.size()[0];i++){
            radarImage.append(String.format(row,i + 1,
                    radarSymbols.get(radar.getCell(i,0)), radarSymbols.get(radar.getCell(i,1)),
                    radarSymbols.get(radar.getCell(i,2)), radarSymbols.get(radar.getCell(i,3)),
                    radarSymbols.get(radar.getCell(i,4)), radarSymbols.get(radar.getCell(i,5)),
                    radarSymbols.get(radar.getCell(i,6)), radarSymbols.get(radar.getCell(i,7)),
                    radarSymbols.get(radar.getCell(i,8)), radarSymbols.get(radar.getCell(i,9))));
        }
        radarImage.append("\n");
        out.print(radarImage);
    }
}
