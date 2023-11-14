package de.ait.zooshop;

public class Dachshund extends Dog {

    public Dachshund(String name) {
        super(name, "Dachshund");
    }

    public void lookingFor(){
        System.out.println("OK, it was found");
    }
}
