package dzaimenn.planet;

class Moon {
    private String name;

    Moon(String name) {
        this.name = name;
    }

    void orbit() {
        System.out.println(name + " is orbiting.");
    }

}