package de.ait.homework21;

public class Manager  extends Employee{

    private int numSubordinates;

    public Manager(String name, int salary, int numSubordinates) {
        super(name, salary);
        this.numSubordinates = numSubordinates;
    }


    public int getNumSubordinates() {
        return numSubordinates;
    }

    public void setNumSubordinates(int numSubordinates) {
        this.numSubordinates = numSubordinates;
    }

    @Override
    public void work(){
        System.out.println("I manage the team");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Subordinate " + numSubordinates;
    }

}
