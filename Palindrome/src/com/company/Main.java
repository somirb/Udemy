package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(1236));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(15688651));
        System.out.println(isPalindrome(101));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int n = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;

        }
        if (n == reverse) {
            return true;
        }
        return false;
    }
}
