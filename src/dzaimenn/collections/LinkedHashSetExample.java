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
            System.out.println("LinkedHashSet is empty.");
        } else {
            System.out.println("LinkedHashSet is not empty.");
        }

        linkedHashSet.add("Watermelon");
        linkedHashSet.add("Strawberry");
        linkedHashSet.add("Mango");

        System.out.println("Updated elements:");
        for (String fruit : linkedHashSet) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        Set<Integer> numberSet = new LinkedHashSet<>();

        for (int i = 1; i <= 10; i++) {
            numberSet.add(i);
        }

        System.out.println("Numbers in the set:");
        for (int num : numberSet) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}