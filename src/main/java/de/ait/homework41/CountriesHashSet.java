package de.ait.homework41;

import java.util.HashSet;
import java.util.Set;

public class CountriesHashSet {

    private static  Set<String> countriesSet = new HashSet<>();

    public static void main(String[] args) {

        countriesSet.add("США");
        countriesSet.add("Великобритания");
        countriesSet.add("Германия");
        countriesSet.add("Чехия");
        countriesSet.add("Германия");
        countriesSet.add("Франция");

        //Выведите на экран размер (количество элементов) countriesList
        System.out.println("Размеры countriesSet --> " + countriesSet.size());

        showAllCountries();

    }

    private static void showAllCountries(){
        System.out.println("Все элементы countriesSet: ");
        for (String country : countriesSet) {
            System.out.println(country);
        }
    }
}