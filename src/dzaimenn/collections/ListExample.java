package dzaimenn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListExample {

    public static void main(String[] args) {
        List<Integer> numbers = generateRandomNumbers(10);
        System.out.println("Original list: " + numbers);

        int sum = calculateSum(numbers);
        System.out.println("Sum of all elements: " + sum);

        List<Integer> sortedList = sortList(numbers);
        System.out.println("Sorted list: " + sortedList);

        List<Integer> evenNumbers = filterEvenNumbers(numbers);
        System.out.println("Even numbers in the list: " + evenNumbers);
    }

    public static List<Integer> generateRandomNumbers(int size) {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomNumbers.add(random.nextInt(100));
        }
        return randomNumbers;
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static List<Integer> sortList(List<Integer> numbers) {
        List<Integer> sortedList = new ArrayList<>(numbers);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
    
}