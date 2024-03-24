package models;

public abstract class Building {
    private String name;
    private String address;
    private String buildingType;
    private int area;
    private int yearOld;
    private int price;
    private int numberOfRooms;
    private int numberOfFloors;
    private int numberOfHalls;
    private int numberOfBathrooms;

    public Building(String name, String address, String buildingType, int area, int yearOld, int price, int numberOfRooms, int numberOfFloors, int numberOfHalls, int numberOfBathrooms) {
        this.name = name;
        this.address = address;
        this.buildingType = buildingType;
        this.area = area;
        this.yearOld = yearOld;
        this.price = price;
        this.numberOfRooms = numberOfRooms;
        this.numberOfFloors = numberOfFloors;
        this.numberOfHalls = numberOfHalls;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public int getArea() {
        return area;
    }

    public int getYearOld() {
        return yearOld;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setNumberOfHalls(int numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                "address='" + address + '\'' +
                ", buildingType='" + buildingType + '\'' +
                ", area=" + area +
                ", yearOld=" + yearOld +
                ", price=" + price +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfFloors=" + numberOfFloors +
                ", numberOfHalls=" + numberOfHalls +
                ", numberOfBathrooms=" + numberOfBathrooms +
                '}';
    }
}
