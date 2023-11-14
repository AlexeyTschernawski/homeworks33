package de.ait.homework25;

public class Boat implements Vehicle {

    private String name;
    private int fuelLevel;

    public Boat() {
    }

    public Boat(String name, int fuelLevel) {
        this.name = name;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void drive() {
        System.out.println(name + " is sailing on the water.");
    }

    @Override
    public void stop() {
        System.out.println(name + " has anchored and stopped sailing.");
    }

    @Override
    public void fuelUp() {
        fuelLevel += 30;
        System.out.println(name + " has been fueled up. Current fuel level: " + fuelLevel + " liters.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
