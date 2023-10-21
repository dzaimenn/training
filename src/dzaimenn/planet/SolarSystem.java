package dzaimenn.planet;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    public static void main(String[] args) throws InterruptedException {
        List<Planet> planets = new ArrayList<>();

        planets.add(new Planet("Mercury", 36));
        planets.add(new Planet("Venus", 67));
        planets.add(new Planet("Earth", 93));
        planets.add(new Planet("Mars", 142));
        planets.add(new Planet("Jupiter", 484));
        planets.add(new Planet("Saturn", 886));
        planets.add(new Planet("Uranus", 1782));
        planets.add(new Planet("Neptune", 2793));

        for (Planet planet : planets) {
            planet.start();
        }

        for (Planet planet : planets) {
            planet.join();
        }

        System.out.println("All planets have completed their journeys.");
    }

}