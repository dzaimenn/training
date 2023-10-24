package dzaimenn.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Welcome to the Super Calculator!");

        try {
            System.out.print("Enter the first number: ");
            num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter the second number: ");
            num2 = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("Error! Invalid input. Please enter numeric values.");
            return;
        }

        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                operator = '+';
                break;
            case 2:
                operator = '-';
                break;
            case 3:
                operator = '*';
                break;
            case 4:
                operator = '/';
                break;
            default:
                System.out.println("Error! Invalid choice.");
                return;
        }

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