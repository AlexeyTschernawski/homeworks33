package de.ait.homework25;

public class Car implements Vehicle {

    private String brand;
    private String model;
    private int fuelLevel;

    public Car() {
    }

    public Car(String brand, String model, int fuelLevel) {
        this.brand = brand;
        this.model = model;
        this.fuelLevel = fuelLevel;
    }


    @Override
    public void drive() {
        System.out.println(brand + " " + model + " is driving.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " " + model + " has stopped.");
    }

    @Override
    public void fuelUp() {
        fuelLevel += 45;
        System.out.println(brand + " " + model + " has been fueled up. Current fuel level: " + fuelLevel + " liters.");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
