package de.ait.zooshop;



public class TestZooshop {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic");
        Dog dog = new Dog("Max", "Unknown");
        Bulldog bulldog = new Bulldog("Bill");
        Dachshund dachshund = new Dachshund("Scharik");

        animal.makeSound();
        dog.makeSound();
        bulldog.snore();
        dachshund.lookingFor();

        System.out.println(bulldog.getBreed());
        bulldog.makeSound();

        System.out.println(dog.getName());




    }
}
