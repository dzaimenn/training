package dzaimenn.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExample {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("grape");
        words.add("watermelon");

        System.out.println("Words starting with 'a':");
        List<String> wordsStartingWithA = words.stream().filter(startsWith("a")).collect(Collectors.toList());
        for (String word : wordsStartingWithA) {
            System.out.println(word);
        }

        System.out.println("Words ending with 'e':");
        List<String> wordsEndingWithE = words.stream().filter(endsWith("e")).collect(Collectors.toList());
        for (String word : wordsEndingWithE) {
            System.out.println(word);
        }

        System.out.println("Uppercase words:");
        List<String> uppercaseWords = words.stream().map(toUpperCase()).collect(Collectors.toList());
        for (String word : uppercaseWords) {
            System.out.println(word);
        }
    }

    private static Predicate<String> startsWith(String prefix) {
        return s -> s.startsWith(prefix);
    }

    private static Predicate<String> endsWith(String suffix) {
        return s -> s.endsWith(suffix);
    }

    private static Function<String, String> toUpperCase() {
        return String::toUpperCase;
    }

}