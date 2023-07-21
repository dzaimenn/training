package dzaimenn.datatype;

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
    }
}