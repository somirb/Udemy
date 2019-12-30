package com.company;

public class Main {

    public static void main(String[] args) {

        numberToWords(12);
        numberToWords(1568);
        numberToWords(-12);
        numberToWords(1000);
        numberToWords(1010);
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(100));
        System.out.println(getDigitCount(151));
        System.out.println(getDigitCount(12354));

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse *= 10;
            reverse += digit;
            number /= 10;
        }
        while (reverse > 0) {
            int digit = reverse % 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverse /= 10;
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse *= 10;
            reverse += digit;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        int n = number;
        int difference = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}