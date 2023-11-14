package de.ait.homework28;

import java.util.ArrayList;
import java.util.List;

public class TestInventory {
    public static void main(String[] args) {
        List<Product> products = createProducts();
        Inventory inventory = new Inventory(products);

       // inventory.showAllProducts();

       // inventory.sell(products.get(0), 10);

       // inventory.showAllProducts();

       /* inventory.sell("sony");
        inventory.showAllProducts();
        inventory.sell("sony");
        inventory.sell("sony");*/

        SortUtil sortUtil = new SortUtil();
        products = sortUtil.sortByQuantity(products, false);
        inventory.showAllProducts();

    }


    public static List<Product> createProducts(){
        List<Product> productList = new ArrayList<>();
        Electronics televizor = new Electronics("sony",333.33, 12, 2);
        Electronics televizor1 = new Electronics("sharp",444.33,33,2);
        Groceries frukt = new Groceries("banan", 2.55,10,"15 september");
        Groceries ovosh = new Groceries("kartoshka",3.99,400,"26 Januar");
        Electronics watch = new Electronics("wallClock", 20.5, 5, 2);
        Groceries cola = new Groceries("coca-cola", 2.40, 100, "22.10.2023");
        productList.add(televizor);
        productList.add(televizor1);
        productList.add(frukt);
        productList.add(ovosh);
        productList.add(watch);
        productList.add(cola);
        return productList;
    }
}
