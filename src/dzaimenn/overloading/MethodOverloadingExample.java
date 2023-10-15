package dzaimenn.overloading;

import java.util.Arrays;

public class MethodOverloadingExample {
    private String message;
    private int[] numbers;
    private boolean initialized;
    private double[] doubles;
    private char[] characters;

    public MethodOverloadingExample() {
        this("Default Message");
    }

    public MethodOverloadingExample(String message) {
        this.message = message;
        this.initialized = true;
    }

    public MethodOverloadingExample(String message, int[] numbers) {
        this.message = message;
        this.numbers = numbers;
        this.initialized = true;
    }

    public MethodOverloadingExample(String message, int[] numbers, double[] doubles) {
        this.message = message;
        this.numbers = numbers;
        this.doubles = doubles;
        this.initialized = true;
    }

    public MethodOverloadingExample(String message, int[] numbers, double[] doubles, char[] characters) {
        this.message = message;
        this.numbers = numbers;
        this.doubles = doubles;
        this.characters = characters;
        this.initialized = true;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public void displayMessage() {
        System.out.println("Message: " + message);
    }

    public void processNumber(int num) {
        System.out.println("Processing integer: " + num);
    }

    public void processNumber(double num) {
        System.out.println("Processing double: " + num);
    }

    public void processText(String text) {
        System.out.println("Processing text: " + text);
    }

    public void processText(String text, int times) {
        System.out.println("Processing text multiple times: " + text.repeat(times));
    }

    public void processNumbers() {
        if (numbers == null) {
            System.out.println("No numbers to process.");
        } else {
            System.out.println("Processing numbers: " + Arrays.toString(numbers));
        }
    }

    public void processNumbers(int[] nums) {
        System.out.println("Processing numbers: " + Arrays.toString(nums));
    }

    public void processDoubles() {
        if (doubles == null) {
            System.out.println("No doubles to process.");
        } else {
            System.out.println("Processing doubles: " + Arrays.toString(doubles));
        }
    }

    public void processCharacters() {
        if (characters == null) {
            System.out.println("No characters to process.");
        } else {
            System.out.println("Processing characters: " + Arrays.toString(characters));
        }
    }

    public void processMixedData(Object[] data) {
        System.out.print("Processing mixed data: ");
        for (Object obj : data) {
            System.out.print(obj.toString() + " ");
        }
        System.out.println();
    }

    public void processData(int num, String text) {
        System.out.println("Processing data: " + num + ", " + text);
    }

    public static void main(String[] args) {
        MethodOverloadingExample example1 = new MethodOverloadingExample();
        example1.displayMessage();
        example1.processNumber(42);
        example1.processText("Java is awesome!");

        MethodOverloadingExample example2 = new MethodOverloadingExample("Custom Message");
        example2.displayMessage();
        example2.processNumber(3.14);
        example2.processText("Hello", 3);

        int[] nums = {1, 2, 3, 4, 5};
        double[] doubles = {1.1, 2.2, 3.3};
        char[] chars = {'a', 'b', 'c'};
        MethodOverloadingExample example3 = new MethodOverloadingExample("Custom Message", nums, doubles, chars);
        example3.displayMessage();
        example3.processNumbers();
        example3.processDoubles();
        example3.processCharacters();

        String[] texts = {"one", "two", "three"};
        example3.processMixedData(texts);

        example3.processData(10, "Some data");
    }

}