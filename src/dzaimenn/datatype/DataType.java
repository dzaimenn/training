package dzaimenn.datatype;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        int a = 10, b = 5;
        double pi = 3.14159, radius = 2.5;
        long bigNumber = 1234567890123456789L;
        byte smallNumber = 127;
        short mediumNumber = 32767;
        char letter = 'A';
        boolean isJavaFun = true;

        int sum = a + b, difference = a - b, product = a * b, modulus = a % b;
        double division = (double) a / b, area = pi * radius * radius, circumference = 2 * pi * radius;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);
        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference of Circle: " + circumference);
        System.out.println("Big Number: " + bigNumber);
        System.out.println("Small Number: " + smallNumber);
        System.out.println("Medium Number: " + mediumNumber);
        System.out.println("Letter: " + letter);
        System.out.println("Is Java Fun? " + isJavaFun);

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + ": " + factorial);

        int n1 = 0, n2 = 1, n3, count = 10;
        System.out.print("Fibonacci Series: " + n1 + " " + n2);
        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        scanner.close();
    }
}