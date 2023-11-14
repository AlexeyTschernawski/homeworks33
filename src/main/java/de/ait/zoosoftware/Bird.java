package de.ait.zoosoftware;

public class Bird extends Animal implements Feeding {

    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bird: " +
                "canFly=" + canFly +
                 '\'' + super.toString());
    }

    @Override
    public void eat() {
        System.out.println(getName() + " клюет зернышки");
    }

    public boolean isCanFly() {
        return canFly;
    }

}
