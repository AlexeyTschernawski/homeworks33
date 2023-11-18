package de.ait.homework36;

import java.util.HashSet;
import java.util.Set;

public class SuperheroHashTest {

    public static void main(String[] args) {
        Superhero superheroBatman = new Superhero("Batman", 7, 35);
        Superhero superheroRobin = new Superhero("Robin", 7, 35);
        System.out.println( superheroBatman.getName() + " " + superheroBatman.hashCode());
        System.out.println( superheroRobin.getName() + " " + superheroRobin.hashCode());
        System.out.println(superheroBatman.equals(superheroRobin));

        Set<Superhero> superheroSet = new HashSet<>();
        superheroSet.add(superheroBatman);
        superheroSet.add(superheroRobin);

        System.out.println(superheroSet);



    }
}
