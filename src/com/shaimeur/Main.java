package com.shaimeur;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // write your code here

        ArrayList<Cards> deck1 = new ArrayList<Cards>(12);

        Land lava = new Land("MerDeMagma",10,"Red",70,Land);
        Land desert = new Land("SabakoNoLand",10,"Black",80,Land);
        Land marecage = new Land("marecage", 10, "Blue", 85,Land);
        Land amazon = new Land("amazon", 10, "Green", 90,Land);


        Creature hunter = new Creature("Ichiji", 20, 70, 150,Creature);
        Creature dragon = new Creature("Ignel", 30, 100, 200,Creature);
        Creature demon = new Creature("Kurama", 50, 120, 300,Creature);
        Creature angel = new Creature("Kira", 100, 90, 190,Creature);
        Creature saitama = new Creature("Saitama", 1000, 1000, 1090,Creature);

        Magic blackHole = new Magic("BlackHole", 120, "BLACK OUT",Magic);
        Magic ragnarock = new Magic("Ragnarock", 130, "ALL OUT",Magic);
        Magic allForOne = new Magic("ALLForOne", 130, "ALLMEIGHT",Magic);


        // add land to deck
        deck1.add(lava);
        deck1.add(desert);
        deck1.add(marecage);
        deck1.add(amazon);
        // add creature to deck
        deck1.add(hunter);
        deck1.add(dragon);
        deck1.add(demon);
        deck1.add(angel);
        deck1.add(saitama);

        // add magic to deck

        deck1.add(blackHole);
        deck1.add(ragnarock);
        deck1.add(allForOne);

        ArrayList<Cards> deck2 = (ArrayList<Cards>) deck1.clone();

        Collections.shuffle(deck1);

        Collections.shuffle(deck2);


        Player player1 = new Player(100, "luffy", deck1);
        Player player2 = new Player(100, "Kaido", deck2);



        System.out.println(player1.getDeck(deck1));
        System.out.println(player2.getDeck(deck2));






        // match star

        // case one Same Type of  Cards

       /* for (int i = 1; i <= 12; i++) {
            if (player1.getDeck(deck[i].getType("")) == player2.getDeck(deck2[i]).getType()){

            }
        }*/

















        /*
        Land land1 = new Land("land",2,"noir",11);
        Creature creature1 = new Creature("monster",100,12,12);
        Magic magic1 = new Magic("magic",2,"Black hole");

         */


    }
}
