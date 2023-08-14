package dzaimenn.classes;

import java.util.List;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean isAvailable;
    private List<String> features;

    public Car(String brand, String model, int year, double price, boolean isAvailable, List<String> features) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isAvailable = isAvailable;
        this.features = features;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("Features:");
        for (String feature : features) {
            System.out.println("- " + feature);
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void addFeature(String feature) {
        features.add(feature);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public List<String> getFeatures() {
        return features;
    }

}