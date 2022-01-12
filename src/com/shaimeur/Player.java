package com.shaimeur;

import java.util.*;

public class Player {
    private int score;
    private String name;
    private ArrayList<Cards> deck = new ArrayList<Cards>();


    public Player(int score, String name, ArrayList<Cards> deck) {
        this.setScore(score);
        this.setName(name);
        this.setDeck(deck);
    }


    public void setDeck(ArrayList<Cards> deck) {

        this.deck = deck;


    }

    public ArrayList<Cards> getDeck(ArrayList<Cards> deck) {
        return deck;
    }

    public int getScore(int score) {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return score + " " + name + " " + deck;
    }

















/*


    public  void getDeck(){
        ArrayList<Cards> deck = new ArrayList<Cards>(12);

    }

 */
}
