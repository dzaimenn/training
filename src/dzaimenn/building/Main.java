package dzaimenn.building;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Build> buildings = new ArrayList<>();
        buildings.add(new Build("Office", 10, "123 Main Street"));
        buildings.add(new Build("Residential", 5, "456 Elm Street"));
        buildings.add(new Build("School", 3, "789 Oak Avenue"));

        System.out.println("List of Buildings:");
        for (Build building : buildings) {
            System.out.println("Type: " + building.getType() + ", Floors: " + building.getNumberOfFloors() + ", Address: " + building.getAddress());
        }

        List<Citizen> citizens = new ArrayList<>();
        citizens.add(new Citizen("John Doe", 30, "123 Main Street"));
        citizens.add(new Citizen("Jane Smith", 25, "456 Elm Street"));
        citizens.add(new Citizen("Bob Johnson", 40, "789 Oak Avenue"));

        System.out.println("\nList of Citizens:");
        for (Citizen citizen : citizens) {
            System.out.println("Name: " + citizen.getName() + ", Age: " + citizen.getAge() + ", Address: " + citizen.getAddress());
        }

        for (Build building : buildings) {
            System.out.println("\nBuilding: " + building.getAddress());
            System.out.println("Residents:");
            for (Citizen citizen : citizens) {
                if (citizen.getAddress().equals(building.getAddress())) {
                    System.out.println("- " + citizen.getName());
                }
            }
        }
    }

}