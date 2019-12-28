package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigitsTwo(-1));
        System.out.println(sumDigitsTwo(1));
        System.out.println(sumDigitsTwo(123));
        System.out.println(sumDigitsTwo(157));
        System.out.println(sumDigitsTwo(32123));
    }

    public static int sumDigitsTwo(int num) {
        if (num < 10) {
            return -1;
        }

        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
