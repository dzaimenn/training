package dzaimenn.building;

import java.util.List;

class City {
    private String name;
    private List<Build> buildings;
    private List<Citizen> citizens;

    public City(String name, List<Build> buildings, List<Citizen> citizens) {
        this.name = name;
        this.buildings = buildings;
        this.citizens = citizens;
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

}