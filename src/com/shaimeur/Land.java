package com.shaimeur;

public class Land extends Cards {
    private String color;
    private int size;


    public Land(String cardName, int cost, String color, int size, Cards type) {
        super(cardName, cost, type);
        this.setColor(color);
        this.setSize(size);

    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(String color) {
        return color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize(int size) {
        return size;
    }

    @Override
    public String toString() {
        return color + " " + size;
    }

}

