package de.ait.homework36;

import java.util.Objects;

public class Superhero {

    private String name;

    private int power;

    private int age;

    public Superhero(String name, int power, int age) {
        this.name = name;
        this.power = power;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power >= 1 && power <= 10) {
            this.power = power;
        } else {
            System.err.println("Wrong power " + power);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "name '" + name + '\'' +
                        ", power " + power +
                        ", age " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Superhero superhero)) return false;
        return power == superhero.power &&
                age == superhero.age &&
                Objects.equals(name, superhero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power, age);
    }
}
