package de.ait.homework36;

import java.util.ArrayList;
import java.util.List;

public class SuperheroManager {

    private List<Superhero> superheroes = new ArrayList<>();

    public void addSuperhero(Superhero superhero) {
        if (!checkSuperhero(superhero.getName()) && checkPower(superhero)) {
            superheroes.add(superhero);
        } else {
            System.out.println("Hero " + superhero.getName() + " can not be added ");
        }
    }

    public void removeSuperhero(String name) {
        if (checkSuperhero(name)) {
            for (Superhero superhero : superheroes) {
                if (superhero.getName().equals(name)) {
                    superheroes.remove(superhero);
                }
            }
        } else {
            System.err.println("Hero " + name + " can not be removed, was not found ");
        }

    }

    public Superhero getSuperhero(String name) {
        return searchSuperhero(name);
    }

    public List<Superhero> getAllSuperheroes() {
        return superheroes;
    }


    public boolean updateSuperhero(String name, Superhero newSuperhero){
        Superhero superhero = searchSuperhero(name);

        if(superhero != null){
            superhero.setName(newSuperhero.getName());
            superhero.setAge(newSuperhero.getAge());
            superhero.setPower(newSuperhero.getPower());
            return true;
        }
        return false;
    }

    private boolean checkSuperhero(String superheroName) {
        for (Superhero superhero : superheroes) {
            if (superheroName.equals(superhero.getName())) {
                return true;
            }
        }
        return false;
    }

    private boolean checkPower(Superhero superhero) {
        if (superhero.getPower() >= 1 && superhero.getPower() <= 10) {
            return true;
        } else return false;
    }

    private Superhero searchSuperhero(String name) {
        for (Superhero superhero : superheroes) {
            if (superhero.getName().equals(name)) {
                return superhero;
            }
        }
        return null;
    }


}
