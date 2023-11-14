package de.ait.homework26;

public interface Swimmer {

    int MIN_SWIM_DISTANCE = 25;



    void swim();

    void dive();

    void checkAge(int age);

    default void warmUp(){
        System.out.println("Warming up before swimming");
    }
}
