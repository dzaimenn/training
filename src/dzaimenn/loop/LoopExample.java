package dzaimenn.loop;

public class LoopExample {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = i * 10 + j;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        int[] fibonacci = new int[20];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < 20; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.print("First 20 Fibonacci numbers: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println();

        String[] names = {"Alice", "Bob", "Charlie", "David", "Emma"};

        for (String name : names) {
            System.out.println("Hello, " + name + "!");
        }

        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
    
}