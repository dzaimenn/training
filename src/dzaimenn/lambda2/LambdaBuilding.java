package dzaimenn.lambda2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaBuilding {
    public static void main(String[] args) {
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building("123 Main St", 5));
        buildings.add(new Building("456 Elm St", 8));
        buildings.add(new Building("789 Oak St", 3));
        buildings.add(new Building("101 Pine St", 12));

        System.out.println("Buildings with more than 5 floors:");
        printSelectedBuildings(buildings, b -> b.getFloors() > 5);

        System.out.println("Buildings with addresses containing 'St':");
        printSelectedBuildings(buildings, b -> b.getAddress().contains("St"));
    }

    private static void printSelectedBuildings(List<Building> buildings, Predicate<Building> predicate) {
        for (Building building : buildings) {
            if (predicate.test(building)) {
                System.out.println(building.getAddress() + " - " + building.getFloors() + " floors");
            }
        }
    }

}