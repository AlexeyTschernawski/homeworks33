package de.ait.homework21;

public class Engineer extends Employee {

    private String specialization;

    public Engineer(String name, int salary, String specialization) {
        super(name, salary);
        this.specialization = specialization;
    }

    public Engineer(String name, String specialization) {
        super(name, 30000);
        this.specialization = specialization;
    }

    @Override
    public void work(){
        System.out.println("I'm developing");
        System.out.println(toString());
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
     public String toString() {
        return super.toString() + " Specialization: " + this.getSpecialization();
    }
}
