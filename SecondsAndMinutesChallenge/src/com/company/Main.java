package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        System.out.println(getDurationString(485,8));
        System.out.println(getDurationString(3907));
        System.out.println((getDurationString(1000,55)));
        System.out.println((getDurationString(-45)));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hoursString = hours + "h ";
        if (hours < 10 ) {
            hoursString = "0" + hours + "h ";
        }

        String minutesString = remainingMinutes + "m ";
        if (remainingMinutes < 10 ) {
            minutesString = "0" + remainingMinutes + "m ";
        }

        String secondsString = seconds + "s ";
        if (seconds < 10 ) {
            secondsString = "0" + seconds + "s";
        }

        return hoursString + minutesString + secondsString;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int remainingMinutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(remainingMinutes, remainingSeconds);
    }
}