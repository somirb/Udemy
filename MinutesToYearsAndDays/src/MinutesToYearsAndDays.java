public class MinutesToYearsAndDays {

    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-5);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long days = ((minutes % 525600) / 60) / 24;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }
}
