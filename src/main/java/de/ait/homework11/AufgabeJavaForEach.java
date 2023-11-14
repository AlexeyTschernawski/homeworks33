package de.ait.homework11;

import java.util.Arrays;

public class AufgabeJavaForEach {

    public static void main(String[] args) {
        /**
         for (Element_type variable : collection) {
         // loop body
          }
         */
        int[] array = new int[]{30, 20, 40, 90, 40, 40, 55};

        for(int number: array){
            //System.out.print(number + " ");
            if(number == 20){
                System.out.println("20!!!!");
            }
        }

       //Copying arrays
        int[] arrayCopy = Arrays.copyOf(array, array.length);

        //Array comparison
        boolean copyResult = Arrays.equals(array, arrayCopy);

        //Array comparison
        Arrays.fill(arrayCopy, 999);

        //Sort an array
        Arrays.sort(array);




        for(int i=0; i< array.length; i++){
            if(array[i] == 20){
                System.out.println("20!!!!");
                array[i]= 300;
            }
        }


    }
}
