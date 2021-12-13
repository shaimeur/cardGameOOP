package com.shaimeur;

public class Main {

    public static void main(String[] args) {

	// write your code here

        Land land1 = new Land("green");
        Creature creature1 = new Creature(100,12);
        Magic magic1 = new Magic("Black hole");
        System.out.println(land1.color);
        System.out.println(creature1.PA);
        System.out.println(creature1.PV);
        System.out.println(magic1.description);


    }
}
