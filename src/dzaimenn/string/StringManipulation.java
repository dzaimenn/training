package dzaimenn.string;

public class StringManipulation {

    public static void main(String[] args) {
        String greeting = "Hello, World!";
        System.out.println(greeting);

        String name = "John";
        int age = 30;
        String message = formatMessage(name, age);
        System.out.println(message);

        String sentence = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Original sentence: " + sentence);

        String uppercaseSentence = sentence.toUpperCase();
        System.out.println("Uppercase: " + uppercaseSentence);

        String lowercaseSentence = sentence.toLowerCase();
        System.out.println("Lowercase: " + lowercaseSentence);

        String trimmedSentence = sentence.trim();
        System.out.println("Trimmed: " + trimmedSentence);

        String replacedSentence = sentence.replace("fox", "cat");
        System.out.println("Replaced: " + replacedSentence);

        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        String concatenated = "This " + "is " + "a " + "concatenated " + "string.";
        System.out.println(concatenated);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Java ");
        stringBuilder.append("is ");
        stringBuilder.append("fun!");
        System.out.println(stringBuilder.toString());

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("StringBuffer ");
        stringBuffer.append("is ");
        stringBuffer.append("thread-safe.");
        System.out.println(stringBuffer.toString());

        String emptyString = "";
        System.out.println("Is the string empty? " + isEmpty(emptyString));

        String nullString = null;
        System.out.println("Is the string null? " + isNull(nullString));
    }

    public static String formatMessage(String name, int age) {
        return String.format("Hello, %s! You are %d years old.", name, age);
    }

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean isNull(String str) {
        return str == null;
    }

}