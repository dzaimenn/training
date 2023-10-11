package dzaimenn.overloading;

public class MethodOverloadingExample {
    private String message;
    private int[] numbers;

    public MethodOverloadingExample() {
        this("Default Message");
    }

    public MethodOverloadingExample(String message) {
        this.message = message;
    }

    public MethodOverloadingExample(String message, int[] numbers) {
        this.message = message;
        this.numbers = numbers;
    }

    public void displayMessage() {
        System.out.println(message);
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
            System.out.print("Processing numbers: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public void processNumbers(int[] nums) {
        System.out.print("Processing numbers: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
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
        MethodOverloadingExample example3 = new MethodOverloadingExample("Custom Message", nums);
        example3.displayMessage();
        example3.processNumbers();
    }
    
}