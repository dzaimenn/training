package dzaimenn.collections;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        Vector<String> vector = new Vector<>();
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");
        linkedList.add("Element 4");
        linkedList.add("Element 5");

        vector.add("Item 1");
        vector.add("Item 2");
        vector.add("Item 3");
        vector.add("Item 4");
        vector.add("Item 5");
        System.out.println("LinkedList Elements:");

        for (String element : linkedList) {
            System.out.println(element);
        }
        System.out.println("Vector Elements:");

        for (String item : vector) {
            System.out.println(item);
        }
        linkedList.remove("Element 3");
        linkedList.removeFirst();
        linkedList.removeLast();
        vector.remove("Item 3");
        vector.removeElementAt(0);
        vector.removeElementAt(vector.size() - 1);
        System.out.println("Modified LinkedList:");

        for (String element : linkedList) {
            System.out.println(element);
        }
        
        System.out.println("Modified Vector:");
        for (String item : vector) {
            System.out.println(item);
        }
    }

}