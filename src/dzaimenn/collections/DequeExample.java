package dzaimenn.collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

    public static void main(String[] args) {

        Deque<String> deque = new LinkedList<>();

        deque.add("One");
        deque.add("Two");
        deque.add("Three");
        deque.add("Four");
        deque.add("Five");

        System.out.println("Initial deque: " + deque);

        deque.addFirst("FirstElement");
        deque.addLast("LastElement");

        System.out.println("Deque after adding first and last elements: " + deque);

        String firstElement = deque.peekFirst();
        String lastElement = deque.peekLast();

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque after removing first and last elements: " + deque);

        System.out.println("Iterating through the deque:");
        for (String element : deque) {
            System.out.println(element);
        }

        deque.clear();

        System.out.println("Deque after clearing: " + deque);
    }

}