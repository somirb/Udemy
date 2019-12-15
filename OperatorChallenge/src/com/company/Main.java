package com.company;

public class Main {

    public static void main(String[] args) {

        double numOne = 20.00;
        double numTwo = 80.00;
        double calculation = (numOne + numTwo) * 100;
        System.out.println(calculation);
        double remainder = calculation % 40.00;
        System.out.println(remainder);
        boolean isRemainder = remainder == 0 ? true : false;
        System.out.println(isRemainder);

        if (!isRemainder) {
            System.out.println("Got some remainder");
        }
    }
}