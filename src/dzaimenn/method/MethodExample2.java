package dzaimenn.method;

public class MethodExample2 {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int sum = add(a, b);
        int difference = subtract(a, b);
        double c = 7.5;
        double d = 2.5;
        double product = multiply(c, d);
        double quotient = divide(c, d);
        String message = "Hello, world!";
        printMessage(message);
        boolean result = isGreaterThan(a, b);
        boolean isEqual = isEqualTo(a, b);
        boolean isPositive = isPositiveNumber(a);
        boolean isNegative = isNegativeNumber(b);
        boolean isEven = isEvenNumber(a);
        boolean isOdd = isOddNumber(b);
        int[] array = {1, 2, 3, 4, 5};
        int arraySum = calculateArraySum(array);
        int maxValue = findMaxValue(array);
        int minValue = findMinValue(array);
        boolean isPrime = isPrimeNumber(a);
        boolean isPalindrome = isPalindromeWord("racecar");

        // Additional variables
        boolean isZero = isZeroNumber(0);
        int powerResult = calculatePower(2, 3);
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static boolean isGreaterThan(int x, int y) {
        return x > y;
    }

    public static boolean isEqualTo(int x, int y) {
        return x == y;
    }

    public static boolean isPositiveNumber(int x) {
        return x > 0;
    }

    public static boolean isNegativeNumber(int x) {
        return x < 0;
    }

    public static boolean isEvenNumber(int x) {
        return x % 2 == 0;
    }

    public static boolean isOddNumber(int x) {
        return x % 2 != 0;
    }

    public static int calculateArraySum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static int findMaxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMinValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static boolean isPrimeNumber(int num) {
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

    public static boolean isPalindromeWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return word.equalsIgnoreCase(reversed);
    }

    public static boolean isZeroNumber(int x) {
        return x == 0;
    }

    public static int calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
    
}