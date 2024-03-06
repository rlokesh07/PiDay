package org.example.piday;

import java.util.Random;
public class Problem {

    String problemType;
    int radius, denominator;


    public Problem(String problemType){
        this.problemType = problemType;

        radius = generateRadius();
        denominator = generateDenominator();
    }


    public static int generateRadius() {

        Random rand = new Random();

        return rand.nextInt(30);

    }

    public static int generateDenominator (){

        Random rand = new Random();

        return (rand.nextInt(4)+2);
    }


}
