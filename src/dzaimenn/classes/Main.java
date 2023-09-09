package dzaimenn.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Map<String, Car> carMap = new HashMap<>();

        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Civic", 2018));
        cars.add(new Car("Ford", "Fusion", 2019));
        cars.add(new Car("Tesla", "Model S", 2022));

        System.out.println("List of cars:");
        for (Car car : cars) {
            System.out.println(car);
        }

        carMap.put("Toyota", new Car("Toyota", "Camry", 2020));
        carMap.put("Honda", new Car("Honda", "Civic", 2018));
        carMap.put("Ford", new Car("Ford", "Fusion", 2019));
        carMap.put("Tesla", new Car("Tesla", "Model S", 2022));

        System.out.println("Map of cars:");
        for (Map.Entry<String, Car> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}