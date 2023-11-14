package de.ait.zoosoftware;


public class Swan  extends Bird implements  Swimming, Running, Flying  {

    int age;


    public Swan(String name, boolean canFly, int age) {
        super(name, canFly);
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Swan " + getName() + " is eating now");

    }


    @Override
    public void fly() {
        System.out.println("Swan " + getName() + "is flying");

    }

    @Override
    public void run() {
        System.out.println("Swan " + getName() + "is running");

    }

    @Override
    public void swim() {
        System.out.println("Swan " + getName() + "is swimming");

    }

    public int getAge() {
        return age;
    }
}
