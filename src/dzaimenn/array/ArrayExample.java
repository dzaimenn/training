package dzaimenn.array;

import java.util.Random;

public class ArrayExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"John", "Emma", "Michael", "Sophia", "William"};
        double[] prices = {2.5, 3.75, 1.99, 5.49, 10.0};

        Random random = new Random();
        int[] randomNumbers = new int[7];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }

        System.out.println("Random Numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        int sumRandom = 0;
        for (int num : randomNumbers) {
            sumRandom += num;
        }
        System.out.println("\nSum of Random Numbers: " + sumRandom);

        String shortestName = names[0];
        for (String name : names) {
            if (name.length() < shortestName.length()) {
                shortestName = name;
            }
        }
        System.out.println("Shortest name: " + shortestName);

        int[][] matrix = new int[3][3];
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = count++;
            }
        }

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        System.out.println("Maximum value in the matrix: " + max);
    }

}