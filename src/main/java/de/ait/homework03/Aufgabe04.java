package de.ait.homework03;

public class Aufgabe04 {

    /*
    Создайте программу для книжного магазина,
    которая проверяет, есть ли книга на складе и доступна ли она для покупки.
     Пусть у каждой книги будет булева переменная inStock,
     которую можно проверить при принятии решения о покупке.
     */

    public static void main(String[] args) {
        String book = "Harry Potter";
        int quantityBookHarryPotter = 10;
        boolean inStock = quantityBookHarryPotter > 0;

        if(inStock == true){
            System.out.println("the book " + book + " is available in quantities of "
                    + quantityBookHarryPotter + " pieces");
        }
        else  {
            System.out.println("the book " + book + " not available");
        }

    }
}
