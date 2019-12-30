package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-1654));
        System.out.println(getEvenDigitSum(123456789));

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int digit = 0;
        while (number > 0) {
            digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}