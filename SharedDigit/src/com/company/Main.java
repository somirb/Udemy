package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(5, 50));
        System.out.println(hasSharedDigit(100, 25));
        System.out.println(hasSharedDigit(12, 23));
        System.out.println((hasSharedDigit(15, 55)));
        System.out.println(hasSharedDigit(100, 10));
        System.out.println(hasSharedDigit(16, 17));
        System.out.println(hasSharedDigit(23,27));
    }

    public static boolean hasSharedDigit(int firstNum, int secondNum) {
        if (firstNum < 10 || firstNum > 99 || secondNum < 10 || secondNum > 99) {
            return false;
        }
        int firstNumDigitOne = firstNum / 10;
        int firstNumDigitTwo = firstNum % 10;
        int secondNumDigitOne = secondNum / 10;
        int secondNumDigitTwo = secondNum % 10;

        if (firstNumDigitOne == secondNumDigitOne || firstNumDigitOne == secondNumDigitTwo || firstNumDigitTwo == secondNumDigitOne || firstNumDigitTwo == secondNumDigitTwo) {
            return true;
        }
        return false;
    }
}
