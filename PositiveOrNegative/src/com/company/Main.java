package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        positiveOrNegative();
        positiveOrNegative();
        positiveOrNegative();
    }

    public static void positiveOrNegative() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        long number = input.nextInt();
        if (number < 0) {
            System.out.println("Your number is negative");
        } else if (number > 0){
            System.out.println("Your number is positive");
        } else {
            System.out.println("Your number is zero");
        }
    }
}