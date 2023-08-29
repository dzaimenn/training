package dzaimenn.collections;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    treeSet.add("apple");
                    break;
                case 1:
                    treeSet.add("banana");
                    break;
                case 2:
                    treeSet.add("orange");
                    break;
                case 3:
                    treeSet.add("grape");
                    break;
                case 4:
                    treeSet.add("kiwi");
                    break;
                default:
                    break;
            }
        }

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

        for (String fruit : treeSet) {
            System.out.println("Fruit: " + fruit);
        }

        System.out.println("Checking if 'banana' exists: " + treeSet.contains("banana"));

        System.out.println("Size of TreeSet: " + treeSet.size());

        System.out.println("Clearing TreeSet...");
        treeSet.clear();

        System.out.println("TreeSet is empty: " + treeSet.isEmpty());
    }

}