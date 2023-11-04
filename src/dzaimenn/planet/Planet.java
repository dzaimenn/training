package dzaimenn.planet;

import java.util.ArrayList;
import java.util.List;

class Planet {
    private String name;
    private int distance;
    private List<Moon> moons;

    Planet(String name, int distance) {
        this.name = name;
        this.distance = distance;
        this.moons = new ArrayList<>();
    }

    void addMoon(String moonName) {
        moons.add(new Moon(moonName));
    }

    int getDistance() {
        return distance;
    }

    void start() {
        System.out.println(name + " is starting.");
        for (Moon moon : moons) {
            moon.orbit();
        }
    }

}