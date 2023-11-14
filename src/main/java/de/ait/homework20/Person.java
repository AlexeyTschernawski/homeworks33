package de.ait.homework20;

public class Person {
    /*
      Create a Person class with private fields name and age.
      Add a constructor to initialize these fields.
      Add "getters" and "setters" for these fields.
      Modify the Person class so that the setter
      due to age did not allow installation
      negative meaning. Extend the Person class
      from the first task, adding an error message
      when trying to set an invalid value in
      age field
     */

    private  String name;
    private int age;

    public Person(){
    }


    public Person(String name, int age) {
        if(name.length()==0){
            System.err.println("The minimum name length must be one letter");
        }
        else {
            this.name = name;
        }
        if(age <= 0 || age >=150){
            System.err.println("This age " + age + " years is unacceptable");
        }
        else {
            this.age = age;
        }
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()==0){
            System.err.println("Минимальная длина имени должна быть одной буквой");
        }
        else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0 || age >=150){
            System.err.println("Данный возраст " + age + " лет недопустим");
        }
        else {
            this.age = age;
        }
    }
}
