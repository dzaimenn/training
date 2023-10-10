package dzaimenn.overloading;

public class MethodOverloadingExample {
    public static void main(String[] args) {

    }

    public MethodOverloadingExample() {
        this("Default Message");
    }

    public MethodOverloadingExample(String message) {
        this.message = message;
    }
}
