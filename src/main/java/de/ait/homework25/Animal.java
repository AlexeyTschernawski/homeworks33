package de.ait.homework25;

public interface Animal {


    String CATEGORY = "Animal";

    void makeSound();


    //( >= Java 8)
    static void showCategory() {
        System.out.println("Category: " + CATEGORY);
    }

    //( >= Java 8)
    default void breathe() {
        System.out.println("I can breathe");
    }
}
