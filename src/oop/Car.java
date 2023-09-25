package oop;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean isEngineOn;

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isEngineOn = false;
    }

    public void startEngine() {
        if (!isEngineOn) {
            isEngineOn = true;
            System.out.println("Engine started.");
        } else {
            System.out.println("Engine is already running.");
        }
    }

    public void stopEngine() {
        if (isEngineOn) {
            isEngineOn = false;
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is already stopped.");
        }
    }

    public void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Engine status: " + (isEngineOn ? "Running" : "Stopped"));
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

}