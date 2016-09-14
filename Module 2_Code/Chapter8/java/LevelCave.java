package com.gamecodeschool.c8platformgame;

import android.graphics.Color;

import java.util.ArrayList;

public class LevelCave extends LevelData{

    //A level with one fixed parallax background

    LevelCave() {
        tiles = new ArrayList<String>();
        this.tiles.add("pt................c.c.c.c.......cc.........z.....c.............c.....cccccccc..................4444444444444444..4......");
        this.tiles.add("e....c..c..c...4444444444...77777777.....444444444444444777774444444cccccccc4444444444444...................m........4..");
        this.tiles.add("555555555555...............................................s........444444444..........................................c");
        this.tiles.add("..................d...................................................................d..................444444444444444");
        this.tiles.add(".......................................................z.............................................7..................");
        this.tiles.add(".......................g..............c................m..........................................7.....................");
        this.tiles.add("............c..4.................z....4........................................................7........................");
        this.tiles.add(".......444f44444444444444477777444444444444444444ff44444444f4444444444f444444...............7...........................");
        this.tiles.add("....4..666666...............s.................66666666...6666........666............44444...............................");
        this.tiles.add(".................d.........................r...........e................d...............................................");
        this.tiles.add("..4.................................................................................................c...................");
        this.tiles.add("...c.u.c.u.c.u...4.......................c...........c............................................777777................");
        this.tiles.add("444444444444444......444.....c...4....44444444.....444444......c..................................s.......4.............");
        this.tiles.add("...........................4444444............................4444...................44444...................44.........");
        this.tiles.add(".....................................................................4..........4.......................................");
        this.tiles.add("..............c......c.................d.......444......................4444.............d........................44....");
        this.tiles.add(".............44......44.....................4..........................................................r................");
        this.tiles.add("....m......4444ffffff4444..................4..........................................................................44");
        this.tiles.add(".........444444ffffff444444....c.c.c..................e.....g.............................u..z...............z..........");
        this.tiles.add("44444444444444444444444444444444444444444.............44..........4................4444444444444444444777444444444444444");
        this.tiles.add("44444444444444444444444444444444444444444.............4444444444444..............444444444444444444444444444444444444444");
        this.tiles.add("44444444444444444444444444444444444444444fffffffffffff444444444444444..c...c...44444444444444444444444444444444444444444");
        this.tiles.add("444444444444444444444444444444444444444444444444444444444444444444444ff444f444f44444444444444444444444444444444444444444");
        this.tiles.add("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        this.tiles.add("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        this.tiles.add("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        this.tiles.add("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");


        // Declare the values for the teleports in order of appearance
        locations = new ArrayList<Location>();

        this.locations.add(new Location("LevelCity", 118f, 18f));

        backgroundDataList = new ArrayList<BackgroundData>();
        // note that speeds less than 2 cause problems

        this.backgroundDataList.add(new BackgroundData("underground", true, -1, -10, 25, 4, 35 ));
    }
}

