package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(50,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
        System.out.println(getGreatestCommonDivisor(1010,10));
    }

    public static int getGreatestCommonDivisor(int numOne, int numTwo) {
        if (numOne < 10 || numTwo < 10) {
            return -1;
        }
        int greatCommonDivisor = 0;
        for (int i = 1; i <= numOne && i <= numTwo; i++) {
            if (numOne % i == 0 && numTwo % i == 0) {
                greatCommonDivisor = i;
            }
        }
        return greatCommonDivisor;
    }
}