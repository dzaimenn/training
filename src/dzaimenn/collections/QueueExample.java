package dzaimenn.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            queue.offer(i);
        }

        System.out.println("Initial Queue: " + queue);

        int removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Queue after removal: " + queue);

        int peekedElement = queue.peek();
        System.out.println("Peeked Element: " + peekedElement);
        System.out.println("Queue after peek: " + queue);

        boolean containsElement = queue.contains(5);
        System.out.println("Queue contains 5: " + containsElement);

        int queueSize = queue.size();
        System.out.println("Queue size: " + queueSize);

        queue.clear();
        System.out.println("Queue cleared. Empty: " + queue.isEmpty());
    }
    
}