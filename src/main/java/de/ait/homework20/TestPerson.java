package de.ait.homework20;

public class TestPerson {
    public static void main(String[] args) {
        Person personOne = new Person("Harry Potter", 12);
        System.out.println(personOne.getName());
        System.out.println("------------------");
        personOne.setAge(190);
        System.out.println(personOne.getAge());

        Person personTwo = new Person();
       // personTwo.setName("Larry Potter");
        personTwo.setAge(10);




    }
}
