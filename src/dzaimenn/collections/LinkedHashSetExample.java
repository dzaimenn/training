package dzaimenn.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");
        linkedHashSet.add("Pineapple");

        for (String fruit : linkedHashSet) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        linkedHashSet.remove("Banana");

        for (String fruit : linkedHashSet) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        String searchElement = "Orange";
        if (linkedHashSet.contains(searchElement)) {
            System.out.println(searchElement + " is present.");
        } else {
            System.out.println(searchElement + " is not present.");
        }

        System.out.println("Size: " + linkedHashSet.size());

        linkedHashSet.clear();

        if (linkedHashSet.isEmpty()) {
            System.out.println("Empty.");
        } else {
            System.out.println("Not empty.");
        }
    }

}