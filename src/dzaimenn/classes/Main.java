package dzaimenn.classes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020, 25000, true, new ArrayList<>());
        Car car2 = new Car("Honda", "Civic", 2018, 22000, false, new ArrayList<>());

        car1.addFeature("Automatic transmission");
        car1.addFeature("Sunroof");
        car1.setPrice(26000);

        car2.addFeature("Manual transmission");
        car2.addFeature("Backup camera");
        car2.setAvailability(true);

        car1.displayInfo();
        System.out.println();
        car2.displayInfo();
    }

}