package com.shaimeur;

public class Creature extends Cards{
    int PA ;
    int PV ;
    public Creature(String cardName,int cost,int PA,int PV){
        super(cardName,cost);
        this.PA = PA;
        this.PV = PV;
    }
    @Override
    public String toString() {
        return PA + " " + PV;
    }
}
