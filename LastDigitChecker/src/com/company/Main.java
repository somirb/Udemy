package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(1056,16,256));
        System.out.println(hasSameLastDigit(105,25,36));
        System.out.println(hasSameLastDigit(106,58,79));
        System.out.println(isValid(5));
        System.out.println(isValid(55));
        System.out.println(isValid(1001));
    }

    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree) {
        if (numOne < 10 || numOne > 1000 || numTwo < 10 || numTwo > 1000 || numThree < 10 || numThree > 1000) {
            return false;
        }
        int numOneLast = numOne % 10;
        int numTwoLast = numTwo % 10;
        int numThreeLast = numThree % 10;
        return numOneLast == numTwoLast || numOneLast == numThreeLast || numTwoLast == numThreeLast;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}