package dzaimenn.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<String> fruitStream = fruits.stream();
        Stream<Integer> numberStream = numbers.stream().filter(n -> n % 2 == 0);
        IntStream rangeStream = IntStream.rangeClosed(1, 5);

        List<String> longFruits = fruitStream.filter(fruit -> fruit.length() > 5).collect(Collectors.toList());
        long sum = numberStream.mapToInt(Integer::intValue).sum();
        int[] rangeArray = rangeStream.toArray();

        System.out.println("Fruits with more than 5 letters: " + longFruits);
        System.out.println("Sum of even numbers from 1 to 10: " + sum);
        System.out.println("Array of integers from 1 to 5: " + Arrays.toString(rangeArray));
    }
    
}