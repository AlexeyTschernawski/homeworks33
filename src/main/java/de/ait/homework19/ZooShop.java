package de.ait.homework19;

import java.util.ArrayList;
import java.util.List;

public class ZooShop {
    /*
     Create a class "Pet Shop"
     Fields: name, address, list of animals available for sale.
     Methods: constructor, sellAnimal(String animalName) - sells an animal (removes from the list),
     addAnimal(String animalName) - adds an animal to the list.
     Create a class "Test" In this class create several objects of the above class
      and call their methods.
     */
    private String name;
    private String address;
    private List<String> availableAnimals;


    public ZooShop(String name, String address) {
        this.name = name;
        this.address = address;
        this.availableAnimals = new ArrayList<>();
    }

    public ZooShop(String name, String address, String...animalNames) {
        this.name = name;
        this.address = address;
        this.availableAnimals = new ArrayList<>();
        // adding animals to the store
        addAnimals(animalNames);
    }

    public void sellAnimal(String animalName) {
        if (availableAnimals.contains(animalName)) {
            availableAnimals.remove(animalName);
            System.out.println("From the shop '" + name + "(" + address + ")' animal sold: " + animalName);
        } else {
            System.out.println("animal '" + animalName + "' not found in store '" + name + "(" + address + ")'");
        }
        System.out.println("-----------------------");
    }

    public void addAnimal(String animalName) {
        if (availableAnimals.contains(animalName)) {
            System.out.println("animal '" + animalName + "' already in store '" + name + "(" + address + ")'");
            System.out.println("Choose a different name, for example> " + animalName + " lop-eared red <");
        } else {
            availableAnimals.add(animalName);
            System.out.println("Added animal in the store '" + name + "(" + address + ")': " + animalName);
        }
        System.out.println("-----------------------");
    }
    public void addAnimals(String...animalNames) {
        for (String name : animalNames) {
            addAnimal(name);
        }
    }
    public void listAvailableAnimals() {
        System.out.println("List of available animals in the pet store '" + name + "(" + address + ")':");
        for (String animal : availableAnimals) {
            System.out.println(animal);
        }
        System.out.println("-----------------------");
    }




}
