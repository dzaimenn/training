package dzaimenn.classes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Civic", 2018));
        cars.add(new Car("Ford", "Fusion", 2019));
        cars.add(new Car("Tesla", "Model S", 2022));

        System.out.println("List of cars:");
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("Removing the car at index 2:");
        cars.remove(2);

        System.out.println("Updated list of cars:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }

}