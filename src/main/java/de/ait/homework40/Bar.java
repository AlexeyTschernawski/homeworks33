package de.ait.homework40;

import java.util.HashMap;
import java.util.Map;

public class Bar {

    Map<String, Drink> barCollection = new HashMap<>();

    public boolean addDrink(String id, Drink drink){
        if(id == null || drink == null){
            System.out.println("Некорректные параметры");
            return false;
        }
        else {
            barCollection.put(id,drink);
            System.out.println("Напиток с ID " + id + " Название "  + drink.getName());
            return true;
        }
    }

    public Drink getDrink(String id){

        Drink result =  barCollection.get(id);
        if(result == null){
            System.out.println("Напиток с ID " + id + " не найден");
        }
        return result;
    }

    public Map<String, Drink> getBarCollection() {
        Map<String, Drink> barCollectionToReturn = new HashMap<>(barCollection);
        return barCollectionToReturn;
    }
}
