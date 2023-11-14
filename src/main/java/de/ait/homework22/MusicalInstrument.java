package de.ait.homework22;

public class MusicalInstrument {

    private String name;

    private String type;

    private double price;

    public MusicalInstrument(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public void play(){
        System.out.println("plays " + name);
    }

    public double getRentalCost(int days){
        double rentalPreis = price * 0.1;
        return rentalPreis * days;
    }

    public void sell(){
        //we reduce the price of the tool by 20%
        this.price = price * 0.8;
        System.out.println("The price has been reduced by 20% and is " + price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
