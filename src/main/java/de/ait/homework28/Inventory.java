package de.ait.homework28;

import java.util.List;

public class Inventory  implements InventoryManagement{

    private List<Product> productList;

    public Inventory(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public void restock(Product product, int quantity) {
        for (Product productToSell: productList){
            if(productToSell.equals(product)){
                productToSell.setQuantity(productToSell.getQuantity() + quantity);
                System.out.println("Продукт увеличен: "
                        + productToSell.getName() + " новое количество: "
                        + productToSell.getQuantity());
                return;
            }
        }
    }


    @Override
    public void sell(Product product, int quantity) {
        for (Product productToSell: productList){
            if(productToSell.equals(product)
                    && checkQuantityOfProduct(product, quantity)){
                productToSell.setQuantity(productToSell.getQuantity()
                        - quantity);
                System.out.println("Продукт продан: " +
                        productToSell.getName() + " новое количество: "
                        + productToSell.getQuantity());
                return;
            }
        }
        System.err.println("Продукт с именем " + product.getName() + " не найдет");

    }

    private boolean checkQuantityOfProduct(Product product, int quantity){
        for (Product productToSell: productList){
            if(productToSell.equals(product)){
                if(productToSell.getQuantity() >= quantity){
                    System.out.println("Продукта " + productToSell.getName()
                            + " достаточно для продажи" );
                    return true;
                }
            }
        }
        System.out.println("Продукта " + product.getName()
                + " НЕ достаточно для продажи" );
        return false;
    }

    public void sell(String name){
        boolean found = false;
        for (Product productToSell: productList) {
            if (productToSell.getName().equals(name)) {
                sell(productToSell, 1);
                found = true;
                return;
            }
        }
        if(found == false) {
            System.err.println("Продукт с именем " + name + " не найдет");
        }
    }

    public List<Product> getProductList() {
        return productList;
    }


    public void showAllProducts(){
        for (Product productToShow: productList){
            System.out.println(productToShow.getInfo());
            System.out.println("---------");
        }
    }
}
