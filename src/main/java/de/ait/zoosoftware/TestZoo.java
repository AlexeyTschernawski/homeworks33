package de.ait.zoosoftware;

import java.util.ArrayList;
import java.util.List;

public class TestZoo {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Bird kanareika = new Bird("kanareika", true);

        Bird pinguin = new Bird("pinguin", false);
        Animal wolf = new Predator("wolf");
        Animal cat = new Predator("cat");
        Animal stork = new Bird("Аист", true);
        Animal penguin = new Bird("Пингвин", false);
        Animal eagle = new Bird("Орел", true);
        Animal sparrow = new Bird("Воробей", true);
        Animal falcon = new Bird("Сокол", true);
        Animal cheetah = new Predator("Гепард");
        Animal lion = new Predator("Лев");
        Animal tiger = new Predator("Тигр");
        Animal puma = new Predator("Пума");
        Predator jaguar = new Predator("Ягуар");


        zoo.addAnimal(pinguin);
        zoo.addAnimal(wolf);
        zoo.addAnimal(cat);
        zoo.addAnimal(stork);
        zoo.addAnimal(penguin);
        zoo.addAnimal(eagle);
        zoo.addAnimal(sparrow);
        zoo.addAnimal(cheetah);
        zoo.addAnimal(lion);
        zoo.addAnimal(tiger);
        zoo.addAnimal(puma);
        zoo.addAnimal(falcon);
        zoo.addAnimal(kanareika);

        zoo.displayAllAnimals();

        System.out.println("----------");

        zoo.sortAnimalsByName();
        zoo.displayAllAnimals();
        System.out.println("----------");
        Predator newTiger = new Tiger("Simba", "23w4");
        newTiger.displayInfo();
        newTiger.eat();
        newTiger.setPreyCaught(5);
        newTiger.displayInfo();

        zoo.addAnimal(newTiger);

        Bird swam = new Swan("Hans", true, 2);
        zoo.addAnimal(swam);


        zoo.displayAllAnimals();

        System.out.println("-----all names-----");

        List<Animal> animals = zoo.getAnimals();
        for (Animal animal: animals){
            System.out.println(animal.getName());
        }

        List<Bird> birdsArrayList = new ArrayList<>();
        birdsArrayList.add(kanareika);






    }
}
