package de.ait.homework19;

public class TestZooShop {
    public static void main(String[] args) {
        ZooShop shop1 = new ZooShop("Fluffy paws", "рфьыеук ыекю 147-2А", "rabbit", "Python");
        ZooShop shop2 = new ZooShop("Animals and company ltd.", "fluffy av. 185");
        shop1.addAnimals("Kitten", "Kitten", "Puppy");
        shop1.addAnimal("Parrot");
        shop2.addAnimal("Hamster");
        shop2.addAnimal("Hamster");
        shop2.addAnimal("Rabbit");
        shop2.addAnimal("Parrot");
        shop1.listAvailableAnimals();
        shop2.listAvailableAnimals();
        shop1.sellAnimal("Kitten");
        shop2.sellAnimal("Parrot");

        shop1.sellAnimal("Przewalski's Horse");
        shop2.sellAnimal("Malaria mosquitoes are contagious");

        shop1.listAvailableAnimals();
        shop2.listAvailableAnimals();
    }
}
