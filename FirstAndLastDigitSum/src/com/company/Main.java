package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(1234));
        System.out.println(sumFirstAndLastDigit(986));
        System.out.println(sumFirstAndLastDigit(-55));
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

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int firstNum = 0;
        int lastNum = number % 10;
        while (number > 0) {
            firstNum = number;
            number /= 10;
        }
        return firstNum + lastNum;
    }
}