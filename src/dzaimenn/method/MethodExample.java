package dzaimenn.method;

public class MethodExample {
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Simple Code Example!");

        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        double radius = 3.5;
        double area = calculateArea(radius);
        System.out.println("Area of the circle with radius " + radius + " is: " + area);

        String message = "Hello, World!";
        printMessage(message);

        boolean isEven = checkEvenOrOdd(sum);
        System.out.println("Is the sum " + sum + " even? " + isEven);

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Printing numbers array:");
        printArray(numbers);

        String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Watermelon"};
        System.out.println("Printing fruits array:");
        printArray(fruits);
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void printMessage(String message) {
        System.out.println("Message to print: " + message);
    }

    public static boolean checkEvenOrOdd(int number) {
        return number % 2 == 0;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}