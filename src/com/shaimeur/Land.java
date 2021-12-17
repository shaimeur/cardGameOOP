package com.shaimeur;

public class Land extends Cards{
    String color ;
    int size ;


    public Land(String cardName,int cost,String color,int size){
        super(cardName,cost);
        this.color = color;
        this.size = size;
    }
    @Override
    public String toString() {
        return color + " " + size;
    }

    }

