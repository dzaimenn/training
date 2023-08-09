package dzaimenn.method;

public class MethodExample4 {

    public static void main(String[] args) {
        welcomeUser("Alex");
        int total = sumNumbers(3, 9);
        System.out.println("Total sum: " + total);

        double averageValue = findAverage(5, 10, 15);
        System.out.println("Average value: " + averageValue);

        String reversed = reverseText("Java Programming");
        System.out.println("Reversed text: " + reversed);

        boolean isNumberPrime = checkIfPrime(23);
        System.out.println("Is 23 a prime number? " + isNumberPrime);

        printStarsPattern(6);
    }

    static void welcomeUser(String username) {
        System.out.println("Greetings, " + username + "!");
    }

    static int sumNumbers(int x, int y) {
        return x + y;
    }

    static double findAverage(int... nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        return (double) totalSum / nums.length;
    }

    static String reverseText(String text) {
        StringBuilder reversedText = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText.append(text.charAt(i));
        }
        return reversedText.toString();
    }

    static boolean checkIfPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void printStarsPattern(int rowCount) {
        for (int i = 1; i <= rowCount; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}