package dzaimenn.collections;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("orange");
        treeSet.add("grape");
        treeSet.add("kiwi");

        System.out.println("TreeSet elements:");
        for (String fruit : treeSet) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        System.out.println("Removing 'orange' from TreeSet...");
        treeSet.remove("orange");

        System.out.println("TreeSet after removal:");
        for (String fruit : treeSet) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        System.out.println("Checking if 'banana' exists: " + treeSet.contains("banana"));

        System.out.println("Size of TreeSet: " + treeSet.size());

        System.out.println("Clearing TreeSet...");
        treeSet.clear();

        System.out.println("TreeSet is empty: " + treeSet.isEmpty());
    }

}