package dzaimenn.building;

public class Main {

    public static void main(String[] args) {
        Build building = new Build("Office", 10, "123 Main Street");

        System.out.println("Building Type: " + building.getType());
        System.out.println("Number of Floors: " + building.getNumberOfFloors());
        System.out.println("Address: " + building.getAddress());

        building.setType("Residential");
        building.setNumberOfFloors(15);
        building.setAddress("456 Elm Street");

        System.out.println("\nUpdated Building Type: " + building.getType());
        System.out.println("Updated Number of Floors: " + building.getNumberOfFloors());
        System.out.println("Updated Address: " + building.getAddress());

        Citizen citizen = new Citizen("John Doe", 30, "789 Oak Avenue");

        System.out.println("\nCitizen Name: " + citizen.getName());
        System.out.println("Citizen Age: " + citizen.getAge());
        System.out.println("Citizen Address: " + citizen.getAddress());

        citizen.setName("Jane Smith");
        citizen.setAge(25);
        citizen.setAddress("321 Pine Street");

        System.out.println("\nUpdated Citizen Name: " + citizen.getName());
        System.out.println("Updated Citizen Age: " + citizen.getAge());
        System.out.println("Updated Citizen Address: " + citizen.getAddress());
    }

}