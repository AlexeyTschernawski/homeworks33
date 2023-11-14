package de.ait.homework21;

public class Intern extends Employee{

    private String university;

    public Intern(String name, int salary, String university) {
        super(name, salary);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
