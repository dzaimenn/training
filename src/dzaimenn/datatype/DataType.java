package dzaimenn.datatype;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double division = (double) a / b;
        int modulus = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        double pi = 3.14159;
        float radius = 2.5f;
        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;

        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference of Circle: " + circumference);

        long bigNumber = 1234567890123456789L;
        System.out.println("Big Number: " + bigNumber);

        byte smallNumber = 127;
        System.out.println("Small Number: " + smallNumber);

        short mediumNumber = 32767;
        System.out.println("Medium Number: " + mediumNumber);

        char letter = 'A';
        System.out.println("Letter: " + letter);

        boolean isJavaFun = true;
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