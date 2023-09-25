package oop;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, 25000.0);

        myCar.displayCarInfo();
        System.out.println();

        myCar.startEngine();
        myCar.displayCarInfo();
        System.out.println();

        myCar.stopEngine();
        myCar.displayCarInfo();
        System.out.println();

        myCar.setPrice(26000.0);
        myCar.displayCarInfo();
        System.out.println();

        myCar.setBrand("Honda");
        myCar.setModel("Accord");
        myCar.setYear(2023);
        myCar.displayCarInfo();
    }
    
}