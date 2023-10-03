package dzaimenn.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExample {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("grape");
        words.add("watermelon");

        System.out.println("Words starting with 'a':");
        words.stream().filter(startsWith("a")).forEach(System.out::println);

        System.out.println("Words ending with 'e':");
        words.stream().filter(endsWith("e")).forEach(System.out::println);

        System.out.println("Uppercase words:");
        words.stream().map(toUpperCase()).forEach(System.out::println);
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