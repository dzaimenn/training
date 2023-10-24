package dzaimenn.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Welcome to the Calculator!");

        try {
            System.out.print("Enter first number: ");
            num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter second number: ");
            num2 = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("Error! Invalid input. Please enter numeric values.");
            return;
        }

        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.nextLine().charAt(0);

        result = calculate(num1, num2, operator);
        if (Double.isNaN(result)) {
            System.out.println("Error! Invalid operation or division by zero.");
        } else {
            System.out.println("Result: " + result);
        }
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.NaN; // Indicate error
                }
            default:
                return Double.NaN; // Indicate error
        }
    }
    
}