package com.shaimeur;

public class Magic extends Cards{
    String description;
    public  Magic(String cardName,int cost,String description) {
        super(cardName,cost);
        this.description = description;
    }
    @Override
    public String toString() {
        return description  ;
    }
}
