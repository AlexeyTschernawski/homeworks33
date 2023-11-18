package de.ait.homework37;

public class MobilePhone {

    private int id;

    private String brand;

    private String model;

    private String operatingSystem;

    private double price;

    public MobilePhone(String brand, String model, int operatingSystem, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.operatingSystem = String.valueOf(operatingSystem);
        this.price = price;
    }

    public MobilePhone(String iPhone, String model) {

    }

    public MobilePhone(String brand, String model, String os, int price) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
