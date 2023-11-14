package de.ait;

import org.slf4j.Logger;import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;


public class CountriesArrayList {
    //Создайте объект ArrayList<String> с названием countriesList
    private static List<String> countriesList = new ArrayList<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(CountriesArrayList.class);

    public static void main(String[] args) {
        //Добавьте в countriesList следующие страны: США,
        // Великобритания, Франция, Чехия, Германия, Франция
        String usa = "США";
        countriesList.add(usa);
        LOGGER.info("Добавлена новая страна {}", usa);
        countriesList.add("Великобритания");
        countriesList.add("Германия");
        countriesList.add("Чехия");
        countriesList.add("Германия");
        countriesList.add("Франция");
        //Выведите на экран размер (количество элементов) countriesList
        System.out.println("Размеры countriesList --> " + countriesList.size());
        //Выведите на экран все элементы countriesList в исходном порядке.        showAllCountries();
        //Удалите дубликаты из countriesList и выведите список снова.
        removeDuplicates();        showAllCountries();
    }
    private static void showAllCountries(){
        System.out.println("Все элементы countriesList: ");
        for (String country : countriesList) {
            LOGGER.info(country);        }
    }
    private static void removeDuplicates() {
        List<String> uniqueCountries = new ArrayList<>();
        for (String country : countriesList) {
            if (!uniqueCountries.contains(country)) {
            uniqueCountries.add(country);            }
        }        countriesList = new ArrayList<>(uniqueCountries);
        LOGGER.info("Дубликаты были удалены");    }
}