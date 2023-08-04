package dzaimenn.string;

public class StringManipulation3 {

    public static void main(String[] args) {
        greetUser();
        String name = askForName();
        String formattedName = formatName(name);
        displayGreeting(formattedName);
        int age = askForAge();
        String ageCategory = determineAgeCategory(age);
        displayAgeCategory(ageCategory);
    }

    public static void greetUser() {
        System.out.println("Welcome to the Simple Code Example!");
        System.out.println("Let's get started...");
        System.out.println();
    }

    public static String askForName() {
        System.out.print("Please enter your name: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextLine();
    }

    public static String formatName(String name) {
        return name.trim().toUpperCase();
    }

    public static void displayGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int askForAge() {
        System.out.print("How old are you? ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextInt();
    }

    public static String determineAgeCategory(int age) {
        if (age < 0) {
            return "Invalid Age";
        } else if (age < 18) {
            return "Teenager";
        } else if (age < 65) {
            return "Adult";
        } else {
            return "Senior Citizen";
        }
    }

    public static void displayAgeCategory(String ageCategory) {
        System.out.println("Based on your age, you are categorized as a(n) " + ageCategory + ".");
    }

}