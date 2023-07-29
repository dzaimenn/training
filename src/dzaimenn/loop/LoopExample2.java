package dzaimenn.loop;

public class LoopExample2 {

    public static void main(String[] args) {

        String message = "JAVA ";
        int numLoops = 5;
        int maxNumber = 30;
        boolean printStars = true;

        for (int i = 0; i < numLoops; i++) {
            System.out.print(message);
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (printStars) {
                    System.out.print("* ");
                } else {
                    System.out.print(i * j + " ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (printStars) {
                    System.out.print("* ");
                } else {
                    System.out.print(i * j + " ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 2; i <= maxNumber; i += 2) {
            System.out.print(i + " ");
        }
    }
}