package de.ait.zoosoftware;

public class Tiger extends Predator implements Running, Roaring,Swimming {

    private String colorOfSkin;

    public Tiger(String name, String colorOfSkin) {
        super(name);
        this.colorOfSkin = colorOfSkin;
    }

    @Override
    public void roar() {
        System.out.println("Tiger " + getName() + "is roaring");
    }

    @Override
    public void run() {
        System.out.println("Tiger " + getName() + "is running");

    }

    @Override
    public void swim() {
        System.out.println("Tiger " + getName() + "is swimming");
    }

    public String getColorOfSkin() {
        return colorOfSkin;
    }
}
