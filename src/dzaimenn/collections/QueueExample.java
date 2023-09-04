package dzaimenn.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomInt = random.nextInt(100);
            queue.offer(randomInt);
        }

        System.out.println("Initial Queue: " + queue);

        int removedElement1 = queue.poll();
        int removedElement2 = queue.poll();
        System.out.println("Removed Elements: " + removedElement1 + ", " + removedElement2);
        System.out.println("Queue after removal: " + queue);

        for (int i = 0; i < 5; i++) {
            int randomInt = random.nextInt(100);
            queue.offer(randomInt);
        }
        System.out.println("Queue after adding more elements: " + queue);

        int peekedElement1 = queue.peek();
        int peekedElement2 = queue.peek();
        System.out.println("Peeked Elements: " + peekedElement1 + ", " + peekedElement2);
        System.out.println("Queue after peek: " + queue);

        boolean containsElement1 = queue.contains(50);
        boolean containsElement2 = queue.contains(99);
        System.out.println("Queue contains 50: " + containsElement1);
        System.out.println("Queue contains 99: " + containsElement2);

        int queueSize = queue.size();
        System.out.println("Queue size: " + queueSize);

        queue.clear();
        System.out.println("Queue cleared. Empty: " + queue.isEmpty());
    }

}