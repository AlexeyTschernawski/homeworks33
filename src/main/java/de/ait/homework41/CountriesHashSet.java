package de.ait.homework41;

import java.util.HashSet;
import java.util.Set;

public class CountriesHashSet {

    private static  Set<String> countriesSet = new HashSet<>();

    public static void main(String[] args) {

        countriesSet.add("USA");
        countriesSet.add("UK");
        countriesSet.add("Germany");
        countriesSet.add("Czech Republic");
        countriesSet.add("Germany");
        countriesSet.add("France");

        //Display the size (number of elements) of countriesList
        System.out.println("countriesSet sizes --> " + countriesSet.size());

        showAllCountries();

    }

    private static void showAllCountries(){
        System.out.println("All countriesSet elements: ");
        for (String country : countriesSet) {
            System.out.println(country);
        }
    }
}