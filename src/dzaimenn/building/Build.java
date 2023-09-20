package dzaimenn.building;

public class Build {
    private String type;
    private int numberOfFloors;
    private String address;

    public Build(String type, int numberOfFloors, String address) {
        this.type = type;
        this.numberOfFloors = numberOfFloors;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}