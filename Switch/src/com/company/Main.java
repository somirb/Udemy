package com.company;

public class Main {

    public static void main(String[] args) {

//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was 3 or 4 or 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
        }

        char letter = 'T';

        switch(letter) {
            case 'A':
                System.out.println("You got an A");
                break;
            case 'B':
                System.out.println("You got a B");
                break;
            case 'C':
                System.out.println("You got a C");
                break;
            case 'D':
                System.out.println("You got a D");
                break;
            case 'E':
                System.out.println("You got an E");
                break;
            default:
                System.out.println("Not found");
        }

        String month = "January";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("January");
                break;
            case "february":
                System.out.println("February");
                break;
            default:
                System.out.println("Not found");

        }
    }
}
