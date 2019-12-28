package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isOdd(17));
        System.out.println(isOdd(26));
        System.out.println(sumOdd(1,11));
        System.out.println(sumOdd(15,7));
        System.out.println(sumOdd(-4,7));
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 == 0) {
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end < start || start < 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}