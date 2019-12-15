public class EqualityPrinter {

    public static void main(String[] args) {

        printEqual(-1,2,3);
        printEqual(5,5,5);
        printEqual(6,36,25565);
        printEqual(25,25,10068);
    }

    public static void printEqual(int firstNum, int secondNum, int thirdNum) {
        if (firstNum < 0 || secondNum < 0 || thirdNum < 0) {
            System.out.println("Invalid Value");
        } else if (firstNum == secondNum && secondNum == thirdNum) {
            System.out.println("All numbers are equal");
        } else if (firstNum != secondNum && firstNum != thirdNum && secondNum != thirdNum) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
