package com.company;

public class Main {

    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000 + (myByte + myShort + myInt) * 10;
        System.out.println(myLong);

        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
    }
}