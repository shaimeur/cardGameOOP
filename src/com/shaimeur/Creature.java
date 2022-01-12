package com.shaimeur;

public class Creature extends Cards {
    private int PA;
    private int PV;


    public Creature(String cardName, int cost, int PA, int PV,Cards type) {
        super(cardName, cost,type);
        this.setPA(PA);
        this.setPV(PV);
    }

    public void setPA(int PA) {
        this.PA = PA;
    }

    public int getPA(int PA) {
        return PA;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public int getPV(int PV) {
        return PV;
    }

    @Override
    public String toString() {
        return PA + " " + PV;
    }
}
