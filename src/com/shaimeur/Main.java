package com.shaimeur;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

	// write your code here

        ArrayList<Cards> deck = new ArrayList<Cards>(12);

        Land lava = new Land("MerDeMagma",10,"Red",100);
        Land desert = new Land("SabakoNoLand",10,"Black",80);
        Land marecage = new Land("marecage",10,"Blue",82);
        Land amazon = new Land("amazon",10,"Green",82);

        Creature hunter = new Creature("Ichiji",20,70,150);
        Creature dragon = new Creature("Ignel",30,100,200);
        Creature demon = new Creature("Kurama",50,120,300);
        Creature angel = new Creature("Kira",100,90,190);
        Creature saitama = new Creature("Saitama",1000,1000,1090);

        Magic blackHole = new Magic("BlackHole",120,"BLACK OUT");
        Magic ragnarock = new Magic("Ragnarock",130,"ALL OUT");
        Magic allForOne = new Magic("ALLForOne",130,"ALLMEIGHT");


        // add land to deck
        deck.add(lava);
        deck.add(desert);
        deck.add(marecage);
        deck.add(amazon);
        // add creature to deck
        deck.add(hunter);
        deck.add(dragon);
        deck.add(demon);
        deck.add(angel);
        deck.add(saitama);

        // add magic to deck

        deck.add(blackHole);
        deck.add(ragnarock);
        deck.add(allForOne);

        ArrayList<Cards> deck2 = (ArrayList<Cards>) deck.clone();

        Collections.shuffle(deck);

        Collections.shuffle(deck2);




         Player player1 = new Player(100,"luffy",deck);
         Player player2 = new Player(100,"Kaido",deck);


        System.out.println(player1.getDeck(deck));
        System.out.println(player2.getDeck(deck2));


/*
        public  void starGame(Cards cards){


            for (int i = 0; i <12 ; i++) {
                if (!(player1.getDeck(deck1[i]) == player2.getDeck(deck2[i]))){
                        if (player1.)
                }
            }


        }

 */
















        /*
        Land land1 = new Land("land",2,"noir",11);
        Creature creature1 = new Creature("monster",100,12,12);
        Magic magic1 = new Magic("magic",2,"Black hole");

         */






    }
}
