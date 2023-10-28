package dzaimenn.game;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int attempts = 0;
        final int MAX_ATTEMPTS = 5;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the secret number between 1 and 100.");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts.");

        while (guess != secretNumber && attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            }
        }

        if (guess == secretNumber) {
            System.out.println("Congratulations! You've guessed the secret number.");
        } else {
            System.out.println("Sorry, you've run out of attempts. The secret number was: " + secretNumber);
        }

        scanner.close();
    }
    
}