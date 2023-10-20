package dzaimenn.planet;

class Spacecraft {
    private String name;
    private int speed;

    public Spacecraft(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void travelToPlanet(Planet planet) {
        System.out.println(name + " is traveling to " + planet.getName() + ".");
        try {
            int distance = planet.getDistance();
            int travelTime = distance / speed;
            System.out.println(name + " will take approximately " + travelTime + " hours to reach " + planet.getName() + ".");
            Thread.sleep(travelTime * 1000); // Simulate travel time
            System.out.println(name + " has arrived at " + planet.getName() + ".");
        } catch (InterruptedException e) {
            System.out.println(name + " encountered an interruption during travel.");
        }
    }

}