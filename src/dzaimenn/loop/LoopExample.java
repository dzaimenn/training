package dzaimenn.loop;

import java.util.Scanner;

public class LoopExample {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication table for the number " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " multiplied by " + i + " equals " + (number * i));
        }

        int[] divisibleByThree = {3, 6, 9, 12, 15};
        System.out.println("Numbers divisible by 3:");
        for (int num : divisibleByThree) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }

        System.out.println("Countdown from 10 to 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i <= 100; i += 5) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 100 (increasing by 5): " + sum);

        int[] array = {2, 4, 6, 8, 10};
        int product = 1;
        for (int num : array) {
            product *= num;
        }
        System.out.println("Product of numbers in the array: " + product);

        System.out.println("Even numbers from 1 to 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Odd numbers from 1 to 20:");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Square numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Square of " + i + " is " + (i * i) + ", ");
        }
        System.out.println();

        scanner.close();
    }
}