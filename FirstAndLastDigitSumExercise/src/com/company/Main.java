package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(546));
        System.out.println(sumFirstAndLastDigit(-645));
        System.out.println(sumFirstAndLastDigit(0));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = number % 10;
        while (number > 0) {
            firstDigit = number;
            number /= 10;
        }
        return firstDigit + lastDigit;
    }


}
