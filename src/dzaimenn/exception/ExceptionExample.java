package dzaimenn.exception;

import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {
        UserAccount user = new UserAccount("user123", "password123");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        try {
            user.login(enteredUsername, enteredPassword);
        } catch (InvalidCredentialsException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }

}