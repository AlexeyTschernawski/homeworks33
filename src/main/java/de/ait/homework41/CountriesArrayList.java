package de.ait.homework41;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class CountriesArrayList {

    //Create an ArrayList<String> object called countriesList
    private static List<String> countriesList = new ArrayList<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(CountriesArrayList.class);



    public static void main(String[] args) {
//Add the following countries to the countriesList: USA,
// UK, France, Czech Republic, Germany, France
        String usa = "USA";
        countriesList.add(usa);
        LOGGER.info("New country {} added", usa);

        countriesList.add("UK");
        countriesList.add("Germany");
        countriesList.add("Czech Republic");
        countriesList.add("Germany");
        countriesList.add("France");

        //Display the size (number of elements) of countriesList
        System.out.println("countriesList sizes --> " + countriesList.size());

        //Display all elements of countriesList in their original order.
        showAllCountries();

        //Remove duplicates from countriesList and print the list again.
        removeDuplicates();
        showAllCountries();

    }

    private static void showAllCountries(){
        System.out.println("All elements of countriesList: ");
        for (String country : countriesList) {
            LOGGER.info(country);
        }
    }

    private static void removeDuplicates() {
        List<String> uniqueCountries = new ArrayList<>();
        for (String country : countriesList) {
            if (!uniqueCountries.contains(country)) {
                uniqueCountries.add(country);
            }
        }
        countriesList = new ArrayList<>(uniqueCountries);
        LOGGER.info("Duplicates have been removed");
    }

}
