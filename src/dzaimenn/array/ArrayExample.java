package dzaimenn.array;

public class ArrayExample {
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"John", "Emma", "Michael", "Sophia", "William"};
        double[] prices = {2.5, 3.75, 1.99, 5.49, 10.0};

        System.out.println("Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nNames:");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println("\nPrices:");
        for (double price : prices) {
            System.out.print(price + " ");
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
        System.out.println("\nAverage of numbers: " + average);

        String longestName = "";
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        System.out.println("Longest name: " + longestName);

        System.out.println("Updated prices with 10% discount:");
        for (int i = 0; i < prices.length; i++) {
            prices[i] *= 0.9;
            System.out.print(prices[i] + " ");
        }

        System.out.println("\nReversed numbers:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }

}