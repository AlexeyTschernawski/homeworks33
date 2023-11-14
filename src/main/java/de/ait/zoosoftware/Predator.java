package de.ait.zoosoftware;

public class Predator  extends Animal implements Feeding {

    private int preyCaught = 0;

    public Predator(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Predator:" +
                "preyCaught=" + preyCaught + " " +  super.toString());
    }

    @Override
    public void eat() {
        System.out.println( getName() + " съедает добычу.");
    }

    public int getPreyCaught() {
        return preyCaught;
    }

    public void setPreyCaught(int preyCaught) {
        this.preyCaught = preyCaught;
    }

}
