package dzaimenn.lambda2;

import java.util.List;
import java.util.function.Predicate;

public class BuildingProcessor {

    private static void printSelectedBuildings(List<Building> buildings, Predicate<Building> predicate) {
        for (Building building : buildings) {
            if (predicate.test(building)) {
                System.out.println(building.getAddress() + " - " + building.getFloors() + " floors");
            }
        }
    }

    private static int calculateTotalFloors(List<Building> buildings) {
        int totalFloors = 0;
        for (Building building : buildings) {
            totalFloors += building.getFloors();
        }
        return totalFloors;
    }

    private static void printAverageFloors(List<Building> buildings) {
        int totalFloors = calculateTotalFloors(buildings);
        double averageFloors = totalFloors / (double) buildings.size();
        System.out.println("Average number of floors per building: " + averageFloors);
    }

    private static void printTallestBuilding(List<Building> buildings) {
        Building tallest = buildings.get(0);
        for (Building building : buildings) {
            if (building.getFloors() > tallest.getFloors()) {
                tallest = building;
            }
        }
        System.out.println("The tallest building is: " + tallest.getAddress() + " with " + tallest.getFloors() + " floors");
    }

    private static void printBuildingsWithEvenFloors(List<Building> buildings) {
        System.out.println("Buildings with an even number of floors:");
        for (Building building : buildings) {
            if (building.getFloors() % 2 == 0) {
                System.out.println(building.getAddress() + " - " + building.getFloors() + " floors");
            }
        }
    }

    private static void printBuildingsInReverseOrder(List<Building> buildings) {
        System.out.println("Buildings in reverse order:");
        for (int i = buildings.size() - 1; i >= 0; i--) {
            Building building = buildings.get(i);
            System.out.println(building.getAddress() + " - " + building.getFloors() + " floors");
        }
    }

}