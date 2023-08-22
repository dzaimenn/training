package dzaimenn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListExample {

    public static void main(String[] args) {
        List<Integer> numbers = generateRandomNumbers(15);
        System.out.println("Original list: " + numbers);

        int sum = calculateSum(numbers);
        System.out.println("Sum of all elements: " + sum);

        List<Integer> sortedList = sortList(numbers);
        System.out.println("Sorted list: " + sortedList);

        List<Integer> evenNumbers = filterEvenNumbers(numbers);
        System.out.println("Even numbers in the list: " + evenNumbers);

        int maxNumber = findMaxNumber(numbers);
        System.out.println("Max number in the list: " + maxNumber);

        List<Integer> squaredNumbers = squareList(numbers);
        System.out.println("Squared numbers in the list: " + squaredNumbers);

        List<Integer> reversedList = reverseList(numbers);
        System.out.println("Reversed list: " + reversedList);
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

    public static int findMaxNumber(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static List<Integer> squareList(List<Integer> numbers) {
        List<Integer> squaredNumbers = new ArrayList<>();
        for (int number : numbers) {
            squaredNumbers.add(number * number);
        }
        return squaredNumbers;
    }

    public static List<Integer> reverseList(List<Integer> numbers) {
        List<Integer> reversedList = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversedList.add(numbers.get(i));
        }
        return reversedList;
    }

}