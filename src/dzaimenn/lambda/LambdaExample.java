package dzaimenn.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExample {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        System.out.println("Even numbers:");
        numbers.stream().filter(isMultipleOf(2)).forEach(System.out::println);

        System.out.println("Odd numbers:");
        numbers.stream().filter(isMultipleOf(2).negate()).forEach(System.out::println);

        System.out.println("Squares of numbers:");
        numbers.stream().map(square()).forEach(System.out::println);
    }

    private static Predicate<Integer> isMultipleOf(int divisor) {
        return n -> n % divisor == 0;
    }

    private static Function<Integer, Integer> square() {
        return n -> n * n;
    }
    
}