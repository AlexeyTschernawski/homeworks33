package de.ait.zoosoftware;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Zoo {

    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal newAnimal){
        animals.add(newAnimal);

    }

    public void displayAllAnimals(){
        for (Animal animal: animals){
            animal.displayInfo();
        }
    }

    public void sortAnimalsByName(){
        Collections.sort(animals, Comparator.comparing(Animal::getName));
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
