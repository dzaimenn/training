package dzaimenn.game;

import java.util.Scanner;

public class GuessingGame {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100) + 1;
        int guess = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the secret number between 1 and 100.");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Congratulations! You've guessed the secret number.");
        scanner.close();
    }

}