package dzaimenn.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("grape");
        set.add("watermelon");

        System.out.println("Initial Set: " + set);

        set.add("apple");
        set.add("banana");

        System.out.println("Set after adding duplicates: " + set);

        set.remove("orange");
        System.out.println("Set after removing 'orange': " + set);

        if (set.contains("banana")) {
            System.out.println("Set contains 'banana'");
        }

        System.out.println("Iterating through the set:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        set.clear();
        System.out.println("Set after clearing: " + set);

        if (set.isEmpty()) {
            System.out.println("Set is empty");
        }
    }

}