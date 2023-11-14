package de.ait.homework41;

import java.util.HashMap;
import java.util.Map;

public class CountriesHashMap {

    //пары страна-столица
    private static final Map<String, String> capitalMap = new HashMap<>();

    public static void main(String[] args) {

        capitalMap.put("Чехия", "Прага");
        capitalMap.put("США", "Вашингтон");
        capitalMap.put("Великобритания", "Лондон");
        capitalMap.put("Франция", "Париж");
        capitalMap.put("Германия", "Берлин");

        //Выведите на экран размер(количество элементов) capitalMap.
        System.out.println("Размеры capitalMap --> " + capitalMap.size());

        showCapitalMap();

        capitalMap.replace("США", "Сан-Франциско");

        //Проверьте, содержит ли countriesSet страну "Испания".

        showCapitalMap();

        if (!checkCountry("Испания")) {
            addNewCounty("Испания", "Мадрид");
        }
        showCapitalMap();

        addNewCounty("Испания", "Мадрид");

    }

    private static void showCapitalMap() {
        System.out.println("Все элементы capitalMap: ");
        capitalMap.forEach((key, value) -> System.out.println(key + " " + value));
    }

    private static boolean checkCountry(String countryNameKey) {
        return capitalMap.containsKey(countryNameKey);
    }

    private static boolean addNewCounty(String countryNameKey, String countryNameNewValue) {
        if (!checkCountry(countryNameKey)) {
            capitalMap.put(countryNameKey, countryNameNewValue);
            System.out.println("Страна " + countryNameKey + " со столицей " + countryNameNewValue
                    + " была успешно добавлена");
            return true;
        } else {
            System.out.println("Страна " + countryNameKey + " найдена");
            return false;
        }
    }

}
