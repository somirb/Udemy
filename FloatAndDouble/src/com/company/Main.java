package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float value min = " + myMinFloatValue);
        System.out.println("Float value max = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double value min = " + myMinDoubleValue);
        System.out.println("Double value max = " + myMaxDoubleValue);

        int myInt = 5 / 3;
        float myFloat = 5f / 3f;
        double myDouble = 5.00 / 3.00;
        System.out.println("My int value = "+ myInt);
        System.out.println("My float value = " + myFloat);
        System.out.println("My double value = " + myDouble);

        //convert pounds to kg
        double pounds = 200;
        double kilos = 0.45359237 * pounds;
        System.out.println(pounds + " pounds equals " + kilos + " kilograms");

        double pi = 3.1515927;
        double another = 3_000_000.4_567_890;
        System.out.println(pi);
        System.out.println(another);


    }
}