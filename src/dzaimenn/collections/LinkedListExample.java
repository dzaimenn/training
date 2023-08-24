package dzaimenn.collections;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        Vector<String> vector = new Vector<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        linkedList.add("Fig");

        vector.add("Grapes");
        vector.add("Honeydew");
        vector.add("Kiwi");
        vector.add("Lemon");
        vector.add("Mango");

        System.out.println("Fruits in the LinkedList:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        System.out.println("Fruits in the Vector:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        linkedList.remove("Cherry");
        linkedList.removeFirst();
        linkedList.removeLast();

        vector.remove("Kiwi");
        vector.removeElementAt(0);
        vector.removeElementAt(vector.size() - 1);

        System.out.println("Modified LinkedList:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        System.out.println("Modified Vector:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        System.out.println("Size of the LinkedList: " + linkedList.size());
        System.out.println("Size of the Vector: " + vector.size());

        System.out.println("Does LinkedList contain 'Banana'? " + linkedList.contains("Banana"));
        System.out.println("Does Vector contain 'Lemon'? " + vector.contains("Lemon"));
    }

}