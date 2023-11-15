package de.ait.homework41;

import java.util.HashMap;
import java.util.Map;

public class CountriesHashMap {

    //country-capital pairs
    private static final Map<String, String> capitalMap = new HashMap<>();

    public static void main(String[] args) {

        capitalMap.put("Czech Republic", "Prague");
        capitalMap.put("USA", "Washington");
        capitalMap.put("UK", "London");
        capitalMap.put("France", "Paris");
        capitalMap.put("Germany", "Berlin");

        //Display the size (number of elements) of capitalMap.
        System.out.println("capitalMap sizes --> " + capitalMap.size());

        showCapitalMap();

        capitalMap.replace("USA", "San Francisco");

        //Check if the countriesSet contains the country "Spain".

        showCapitalMap();

        if (!checkCountry("Spain")) {
            addNewCounty("Spain", "Madrid");
        }
        showCapitalMap();

        addNewCounty("Spain", "Madrid");

    }

    private static void showCapitalMap() {
        System.out.println("All capitalMap elements: ");
        capitalMap.forEach((key, value) -> System.out.println(key + " " + value));
    }

    private static boolean checkCountry(String countryNameKey) {
        return capitalMap.containsKey(countryNameKey);
    }

    private static boolean addNewCounty(String countryNameKey, String countryNameNewValue) {
        if (!checkCountry(countryNameKey)) {
            capitalMap.put(countryNameKey, countryNameNewValue);
            System.out.println("Country " + countryNameKey + " with capital " + countryNameNewValue
                    + "was added successfully");
            return true;
        } else {
            System.out.println("Country " + countryNameKey + " found");
            return false;
        }
    }

}
