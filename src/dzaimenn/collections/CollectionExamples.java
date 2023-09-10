package dzaimenn.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Stack;
import java.util.Queue;
import java.util.PriorityQueue;
public class CollectionExamples {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        HashSet<Double> hashSet = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        Stack<String> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
            linkedList.add("Element " + i);
            hashSet.add(0.5 * i);
            hashMap.put("Key" + i, i);
            treeSet.add(i);
            stack.push("Stack Element " + i);
            queue.add((char) ('A' + i));
            priorityQueue.add(10 - i);
        }

        for (int num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (String str : linkedList) {
            System.out.print(str + " ");
        }
        System.out.println();

        for (double num : hashSet) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (String key : hashMap.keySet()) {
            System.out.print(key + ":" + hashMap.get(key) + " ");
        }
        System.out.println();

        for (int num : treeSet) {
            System.out.print(num + " ");
        }
        System.out.println();

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();

        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }
    }
    
}