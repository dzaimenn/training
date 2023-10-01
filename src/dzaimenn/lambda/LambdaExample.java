package dzaimenn.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        System.out.println("Even numbers:");
        numbers.stream().filter(isEven()).forEach(System.out::println);

        System.out.println("Odd numbers:");
        numbers.stream().filter(isOdd()).forEach(System.out::println);
    }

    private static Predicate<Integer> isEven() {
        return n -> n % 2 == 0;
    }

    private static Predicate<Integer> isOdd() {
        return n -> n % 2 != 0;
    }

}