package dzaimenn.method;

public class MethodExample3 {

    public static void main(String[] args) {
        greetUser("John");
        int sum = addNumbers(5, 7);
        System.out.println("Sum of numbers: " + sum);

        double result = calculateAverage(12, 18, 25);
        System.out.println("Average: " + result);

        String reversedString = reverseString("Hello, World!");
        System.out.println("Reversed String: " + reversedString);

        boolean isPrime = checkPrime(17);
        System.out.println("Is 17 a prime number? " + isPrime);

        displayPattern(5);
    }

    static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static int addNumbers(int a, int b) {
        return a + b;
    }

    static double calculateAverage(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void displayPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}