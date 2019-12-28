package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        smallestOfThreeNumbers();
        smallestOfThreeNumbers();
        smallestOfThreeNumbers();
    }

    public static void smallestOfThreeNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        long firstNumber = input.nextLong();
        System.out.println("Enter second number:");
        long secondNumber = input.nextLong();
        System.out.println("Enter third number:");
        long thirdNumber = input.nextLong();
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.println(firstNumber + " is the smallest number");
        } else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
            System.out.println(secondNumber + " is the smallest number");
        } else {
            System.out.println(thirdNumber + " is the smallest number");
        }
    }
}