package dzaimenn.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.add(1);
        integerBox.add(2);
        integerBox.add(3);

        while (!integerBox.isEmpty()) {
            System.out.print(integerBox.remove() + " ");
        }
        System.out.println();

        Pair<String, Integer> pair = new Pair<>("One", 1);
        System.out.println(pair.getKey() + " : " + pair.getValue());

        GenericExample<Integer> example1 = new GenericExample<>(10);
        GenericExample<Double> example2 = new GenericExample<>(5.5);

        System.out.println("Square of 10: " + example1.square());
        System.out.println("Square of 5.5: " + example2.square());

        System.out.println("Is 10 greater than 5.5? " + example1.isGreaterThan(example2));
    }

}

interface Container<T> {
    void add(T item);
    T remove();
    boolean isEmpty();
}

class Box<T> implements Container<T> {
    private List<T> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return items.remove(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class GenericExample<T extends Number> {
    private T data;

    public GenericExample(T data) {
        this.data = data;
    }

    public double square() {
        return data.doubleValue() * data.doubleValue();
    }

    public boolean isGreaterThan(GenericExample<?> other) {
        return data.doubleValue() > other.data.doubleValue();
    }
    
}