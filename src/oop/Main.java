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

        for (Car car : carList) {
            car.displayCarInfo();
            System.out.println();
        }

        for (Car car : carList) {
            car.startEngine();
        }

        for (Car car : carList) {
            car.displayCarInfo();
            System.out.println();
        }

        for (Car car : carList) {
            car.setPrice(car.getPrice() * 1.1);
            car.setYear(car.getYear() + 1);
            car.setModel("New " + car.getModel());
        }

        for (Car car : carList) {
            car.displayCarInfo();
            System.out.println();
        }

        Car newCar = new Car("Chevrolet", "Cruze", 2023, 28000.0);
        carList.add(newCar);

        for (Car car : carList) {
            car.displayCarInfo();
            System.out.println();
        }

        carList.remove(friendCar);

        for (Car car : carList) {
            car.displayCarInfo();
            System.out.println();
        }
    }
    
}