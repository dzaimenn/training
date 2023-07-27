package dzaimenn.loop;

public class LoopExample {

    public static void main(String[] args) {
        int totalCars = 10;
        int totalCycles = 5;

        System.out.println("Starting the simulation...");

        for (int i = 1; i <= totalCars; i++) {
            System.out.print("Car " + i + " is moving. ");
            if (i % 2 == 0) {
                System.out.println("Car " + i + " is honking.");
            } else {
                System.out.println("Car " + i + " is not honking.");
            }
        }

        System.out.println("All cars have finished moving.");

        for (int j = 1; j <= totalCycles; j++) {
            System.out.print("Cycle " + j + " is moving. ");
            if (j % 2 == 0) {
                System.out.println("Cycle " + j + " has a passenger.");
            } else {
                System.out.println("Cycle " + j + " has no passenger.");
            }
        }

        System.out.println("All cycles have finished moving.");

        int sum = 0;
        for (int k = 1; k <= 10; k++) {
            sum += k;
        }
        System.out.println("The sum of numbers from 1 to 10 is: " + sum);

        int factorial = 1;
        for (int m = 1; m <= 5; m++) {
            factorial *= m;
        }
        System.out.println("The factorial of 5 is: " + factorial);

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("End of the simulation.");
    }
}