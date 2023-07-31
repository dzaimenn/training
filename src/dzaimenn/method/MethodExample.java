package dzaimenn.method;

public class MethodExample {

    public static void main(String[] args) {

        int num1 = 15;
        int num2 = 7;
        int difference = subtractNumbers(num1, num2);
        System.out.println("Difference between " + num1 + " and " + num2 + " is: " + difference);

        double sideLength = 4.5;
        double squareArea = calculateSquareArea(sideLength);
        System.out.println("Area of the square with side length " + sideLength + " is: " + squareArea);

        String welcomeMessage = "Hello, Java Developers!";
        displayMessage(welcomeMessage);

        boolean isOdd = checkOddNumber(difference);
        System.out.println("Is the difference " + difference + " odd? " + isOdd);

        int[] integers = {2, 4, 6, 8, 10};
        System.out.println("Printing integer array:");
        printIntArray(integers);

        String[] vegetables = {"Carrot", "Broccoli", "Tomato", "Cabbage", "Spinach"};
        System.out.println("Printing vegetables array:");
        printStringArray(vegetables);

        int exponent = 3;
        long powerResult = calculatePower(2, exponent);
        System.out.println("2 raised to the power of " + exponent + " is: " + powerResult);
    }

    public static int subtractNumbers(int x, int y) {
        return x - y;
    }

    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static void displayMessage(String message) {
        System.out.println("Welcome message: " + message);
    }

    public static boolean checkOddNumber(int number) {
        return number % 2 != 0;
    }

    public static void printIntArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printStringArray(String[] array) {
        for (String item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static long calculatePower(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

}