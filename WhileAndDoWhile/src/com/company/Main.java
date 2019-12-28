package com.company;

public class Main {

    public static void main(String[] args) {

//        int count = 1;
//        while ((count != 6)){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        while (true) {
//            if (count == 6){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        int count = 6;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//            if (count > 100) {
//                break;
//            }
//        } while (count != 6);

        // challenge
        System.out.println(isEvenNumber(4));

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber && count < 5) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            count++;
            System.out.println("Even number " + number);
        }

        System.out.println("Count of even numbers is " + count);

    }

    // challenge
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}