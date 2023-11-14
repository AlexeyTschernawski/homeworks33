package de.ait.homework26;

public class Athlete implements Swimmer, Runner {

    private int age;

    public static final int MIN_AGE = 16;

    @Override
    public void run() {
        System.out.println("Today is run distance " + Runner.MIN_RUN_DISTANCE + " meter");
    }

    @Override
    public void jump() {
        System.out.println("Jumping");
    }

    @Override
    public void swim() {
        System.out.println("Today is  swim distance " + Swimmer.MIN_SWIM_DISTANCE + " meter");

    }

    @Override
    public void dive() {
        System.out.println("Diving");
    }

    @Override
    public void checkAge(int age) {
        if(age < MIN_AGE) {
            System.err.println("Wrong age < 16 !!!");
        }
        else {
            this.age = age;
        }
    }

    @Override
    public void warmUp() {
        System.out.println("Hey, Im Athlete. Age " + age);
        Swimmer.super.warmUp();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
