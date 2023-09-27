package oop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, 25000.0);
        Car friendCar = new Car("Ford", "Focus", 2021, 20000.0);

        List<Car> carList = new ArrayList<>();
        carList.add(myCar);
        carList.add(friendCar);

        System.out.println("Cars in the list:");
        for (Car car : carList) {
            car.displayCarInfo();
            System.out.println();
        }

        System.out.println("Starting engines:");
        for (Car car : carList) {
            car.startEngine();
        }

        System.out.println("Cars after starting engines:");
        for (Car car : carList) {
            car.displayCarInfo();
            System.out.println();
        }
    }

}