package de.ait.homework27;

public interface Vehicle {
    final int MAX_SPEED=120;
    void start();
    void stop();
    default void honk()
    {
        System.out.println("Bi-bi");
    }
    default String getColor()
    {
        System.out.println("Black");
        return("black");
    }
}