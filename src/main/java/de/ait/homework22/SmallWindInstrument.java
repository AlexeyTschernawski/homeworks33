package de.ait.homework22;

public class SmallWindInstrument  extends WindInstrument {

    private int weight;

    public SmallWindInstrument(String name, String type, double price, String material, int weight) {
        super(name, type, price, material);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
