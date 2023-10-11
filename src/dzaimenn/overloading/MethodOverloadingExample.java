package dzaimenn.overloading;

public class MethodOverloadingExample {

    private String message;

    public MethodOverloadingExample() {
        this("Default Message");
    }

    public MethodOverloadingExample(String message) {
        this.message = message;
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

    public static void main(String[] args) {
        MethodOverloadingExample example1 = new MethodOverloadingExample();
        example1.displayMessage();
        example1.processNumber(42);
        example1.processText("Java is awesome!");

        MethodOverloadingExample example2 = new MethodOverloadingExample("Custom Message");
        example2.displayMessage();
        example2.processNumber(3.14);
        example2.processText("Hello", 3);
    }
    
}