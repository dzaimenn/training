package dzaimenn.building;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        City city = new City("Metropolis");

        Map<String, District> districts = new HashMap<>();
        districts.put("Downtown", new District("Downtown"));
        districts.put("Residential Area", new District("Residential Area"));

        districts.get("Downtown").addBuilding(new Build("Office", 10, "1 Main Street"));
        districts.get("Downtown").addBuilding(new Build("Shop", 3, "2 Elm Street"));
        districts.get("Residential Area").addBuilding(new Build("Apartment", 5, "10 Oak Avenue"));
        districts.get("Residential Area").addBuilding(new Build("House", 2, "20 Pine Street"));

        districts.get("Downtown").addCitizen(new Citizen("John Doe", 30, "1 Main Street"));
        districts.get("Downtown").addCitizen(new Citizen("Jane Smith", 25, "2 Elm Street"));
        districts.get("Residential Area").addCitizen(new Citizen("Bob Johnson", 40, "10 Oak Avenue"));
        districts.get("Residential Area").addCitizen(new Citizen("Alice Brown", 35, "20 Pine Street"));

        for (District district : districts.values()) {
            city.addDistrict(district);
        }

        System.out.println("City: " + city.getName());
        for (District district : city.getDistricts()) {
            System.out.println("\nDistrict: " + district.getName());
            System.out.println("Buildings:");
            for (Build building : district.getBuildings()) {
                System.out.println("- Type: " + building.getType() + ", Floors: " + building.getNumberOfFloors() + ", Address: " + building.getAddress());
            }
            System.out.println("Citizens:");
            for (Citizen citizen : district.getCitizens()) {
                System.out.println("- Name: " + citizen.getName() + ", Age: " + citizen.getAge() + ", Address: " + citizen.getAddress());
            }
        }
    }
}

class City {
    private String name;
    private List<District> districts;

    public City(String name) {
        this.name = name;
        this.districts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void addDistrict(District district) {
        districts.add(district);
    }
}

class District {
    private String name;
    private List<Build> buildings;
    private List<Citizen> citizens;

    public District(String name) {
        this.name = name;
        this.buildings = new ArrayList<>();
        this.citizens = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Build> getBuildings() {
        return buildings;
    }

    public List<Citizen> getCitizens() {
        return citizens;
    }

    public void addBuilding(Build building) {
        buildings.add(building);
    }

    public void addCitizen(Citizen citizen) {
        citizens.add(citizen);
    }
    
}
