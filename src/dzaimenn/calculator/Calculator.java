package dzaimenn.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        System.out.println("Welcome to the Calculator!");

        do {
            double num1, num2, result;
            char operator;

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

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error! Invalid operator.");
                    return;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to perform another calculation? (Y/N): ");
            choice = scanner.nextLine().toUpperCase().charAt(0);
        } while (choice == 'Y');
    }
    
}