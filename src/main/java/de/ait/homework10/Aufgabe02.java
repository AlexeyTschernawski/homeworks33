package de.ait.homework10;

public class Aufgabe02 {
    public static void main(String[] args) {
        /*
        Write a program that returns the inverse array. int[]{1, 2, 3, 4, 5}
          will return {5, 4, 3, 2, 1}.
           There is no need to enter the array from the keyboard.
         */

        int [] array=new int[]{1,2,3,4,5};
        int [] arrayNew
                = new int [5];
        int length=array.length;
        for (int i=0;i<=length-1;i++)
        {
            arrayNew[i]=array[length-1-i];
            //System.out.printf("%d ",array1[i]);
        }

        //#2
        int [] massiv;
        massiv= new int[8];
        massiv = new int[]{100, 2, 3, 400, 5, 6, 7, 8};
        for (int i = massiv.length - 1; i >= 0; i--) {
            System.out.print(massiv[i] + " ");
        }


    }
}
