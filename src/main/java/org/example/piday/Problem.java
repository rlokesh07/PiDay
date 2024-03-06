package org.example.piday;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Random;
public class Problem {

    String problemType;
    int radius, denominator;

BigDecimal pi = new BigDecimal("3.1415");
    public Problem(String problemType){
        this.problemType = problemType;

        radius = generateRadius();
        denominator = generateDenominator();

    }

    public BigDecimal answer(){
        return BigDecimal.valueOf(1 - (1/denominator)).multiply(BigDecimal.valueOf(2)).multiply(pi).multiply(BigDecimal.valueOf(radius)).divide(BigDecimal.valueOf(denominator));
    }

    public void refresh(){
        radius = generateRadius();
        denominator = generateDenominator();
    }


    public static int generateRadius() {

        Random rand = new Random();

        return rand.nextInt(30)+15;

    }

    public static int generateDenominator (){

        Random rand = new Random();

        return (rand.nextInt(4)+2);
    }



}
