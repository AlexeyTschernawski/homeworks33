package de.ait.homework26;

public interface Runner {

    int MIN_RUN_DISTANCE = 100;


    void run();

    void jump();

    void checkAge(int age);

    default void stretch(){
        System.out.println("Stretching before running.");
    }


}
