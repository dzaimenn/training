package dzaimenn.method;

public class MethodClasses {
    public static void main(String[] args) {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        DisplayUtilities displayUtilities = new DisplayUtilities();

        int num1 = 15;
        int num2 = 7;
        int difference = arithmeticOperations.subtractNumbers(num1, num2);
        displayUtilities.displayDifference(num1, num2, difference);

        double sideLength = 4.5;
        double squareArea = arithmeticOperations.calculateSquareArea(sideLength);
        displayUtilities.displaySquareArea(sideLength, squareArea);

        String welcomeMessage = "Hello, Java Developers!";
        displayUtilities.displayMessage(welcomeMessage);

        boolean isOdd = arithmeticOperations.checkOddNumber(difference);
        displayUtilities.displayOddCheckResult(difference, isOdd);

        int[] integers = {2, 4, 6, 8, 10};
        displayUtilities.printIntArray(integers);

        String[] vegetables = {"Carrot", "Broccoli", "Tomato", "Cabbage", "Spinach"};
        displayUtilities.printStringArray(vegetables);

        int exponent = 3;
        long powerResult = arithmeticOperations.calculatePower(2, exponent);
        displayUtilities.displayPowerResult(2, exponent, powerResult);
    }
}

class ArithmeticOperations {
    public int subtractNumbers(int x, int y) {
        return x - y;
    }

    public double calculateSquareArea(double side) {
        return side * side;
    }

    public boolean checkOddNumber(int number) {
        return number % 2 != 0;
    }

    public long calculatePower(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}

class DisplayUtilities {
    public void displayDifference(int num1, int num2, int difference) {
        System.out.println("Difference between " + num1 + " and " + num2 + " is: " + difference);
    }

    public void displaySquareArea(double sideLength, double squareArea) {
        System.out.println("Area of the square with side length " + sideLength + " is: " + squareArea);
    }

    public void displayMessage(String message) {
        System.out.println("Welcome message: " + message);
    }

    public void displayOddCheckResult(int difference, boolean isOdd) {
        System.out.println("Is the difference " + difference + " odd? " + isOdd);
    }

    public void printIntArray(int[] array) {
        System.out.println("Printing integer array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void printStringArray(String[] array) {
        System.out.println("Printing vegetables array:");
        for (String item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public void displayPowerResult(int base, int exponent, long result) {
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

}