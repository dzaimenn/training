package dzaimenn.streamsio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamExample {

    public static void main(String[] args) {

        System.out.print("Enter your name: ");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            String name = bufferedReader.readLine();
            System.out.println("Hello, " + name + "!");

            System.out.println("Enter an integer: ");
            int num = Integer.parseInt(bufferedReader.readLine());
            System.out.println("You entered: " + num);

            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread 1: " + i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });

            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 2: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();

            System.out.println("Threads finished execution.");

            bufferedReader.close();
            inputStreamReader.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}