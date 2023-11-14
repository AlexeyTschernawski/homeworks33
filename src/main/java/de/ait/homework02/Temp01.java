package de.ait.homework02;


public class Temp01 {

    public static void main(String[] args) {
        int bookQuantityHarryPotter = 0;
        boolean inStock = bookQuantityHarryPotter > 0;
        String bookName = "Harry PotterX";

        if(bookName.equals("Harry Potter") && inStock == true){
            System.out.println("the book is in warehouse");
        }
        else {
            System.out.println("the book wos not found");
        }

    }


}
