package dzaimenn.building;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Build> buildings = new ArrayList<>();
        buildings.add(new Build("Office", 10, "123 Main Street"));
        buildings.add(new Build("Residential", 5, "456 Elm Street"));
        buildings.add(new Build("School", 3, "789 Oak Avenue"));

        List<Citizen> citizens = new ArrayList<>();
        citizens.add(new Citizen("John Doe", 30, "123 Main Street"));
        citizens.add(new Citizen("Jane Smith", 25, "456 Elm Street"));
        citizens.add(new Citizen("Bob Johnson", 40, "789 Oak Avenue"));

        City city = new City("Metropolis", buildings, citizens);

        System.out.println("City: " + city.getName());
        System.out.println("List of Buildings:");
        for (Build building : city.getBuildings()) {
            System.out.println("Type: " + building.getType() + ", Floors: " + building.getNumberOfFloors() + ", Address: " + building.getAddress());
        }

        System.out.println("\nList of Citizens:");
        for (Citizen citizen : city.getCitizens()) {
            System.out.println("Name: " + citizen.getName() + ", Age: " + citizen.getAge() + ", Address: " + citizen.getAddress());
        }
    }
    
}