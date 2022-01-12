package com.shaimeur;

import java.util.ArrayList;

public abstract class Cards {
    private String cardName;
    private int cost;
    private Cards type;


    public Cards(String cardName, int cost,Cards type) {
        this.setCardName(cardName);
        this.setCost(cost);
        this.setType(type);
    }
    public void setType(Cards type){
        this.type = type ;
    }
    public Cards getType (Cards type){
        return type ;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardName(String cardName) {
        return cardName;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost(int cost) {
        return cost;
    }

}
