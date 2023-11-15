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
                System.out.println("ПProduct increased: "
                        + productToSell.getName() + " new quantity: "
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
                System.out.println("product was sold: " +
                        productToSell.getName() + " new quantity: "
                        + productToSell.getQuantity());
                return;
            }
        }
        System.err.println("product with name " + product.getName() + " not found");

    }

    private boolean checkQuantityOfProduct(Product product, int quantity){
        for (Product productToSell: productList){
            if(productToSell.equals(product)){
                if(productToSell.getQuantity() >= quantity){
                    System.out.println("product " + productToSell.getName()
                            + " enough to sell" );
                    return true;
                }
            }
        }
        System.out.println("product " + product.getName()
                + " NOT enough to sell" );
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
            System.err.println("product with name " + name + " not found");
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
