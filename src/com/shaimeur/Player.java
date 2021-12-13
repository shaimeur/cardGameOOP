package com.shaimeur;

import java.util.ArrayList;

public class Player {
    int score;
    String name;
    ArrayList<Cards> deck = new ArrayList<Cards>();
    public Player(int score,String name ,ArrayList<Cards> deck){
        this.score = score;
        this.name = name;
        this.deck = deck;
    }
    public  static void play(){

    }
}
