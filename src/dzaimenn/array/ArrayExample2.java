package dzaimenn.array;

import java.util.Random;

public class ArrayExample2 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"John", "Emma", "Michael", "Sophia", "William"};
        double[] prices = {2.5, 3.75, 1.99, 5.49, 10.0};

        Random random = new Random();
        int[] randomNumbers = generateRandomNumbers(7, random, 100);

        System.out.println("Random Numbers:");
        printIntArray(randomNumbers);

        int sumRandom = calculateSum(randomNumbers);
        System.out.println("\nSum of Random Numbers: " + sumRandom);

        String shortestName = findShortestName(names);
        System.out.println("Shortest name: " + shortestName);

        int[][] matrix = generateMatrix(3, 3);
        System.out.println("Matrix:");
        printMatrix(matrix);

        int max = findMaxValue(matrix);
        System.out.println("Maximum value in the matrix: " + max);
    }

    public static int[] generateRandomNumbers(int size, Random random, int bound) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(bound);
        }
        return randomNumbers;
    }

    public static void printIntArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static String findShortestName(String[] names) {
        String shortestName = names[0];
        for (String name : names) {
            if (name.length() < shortestName.length()) {
                shortestName = name;
            }
        }
        return shortestName;
    }

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = count++;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int findMaxValue(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

}