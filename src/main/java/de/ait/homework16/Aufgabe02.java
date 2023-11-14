package de.ait.homework16;

import java.util.ArrayList;

public class Aufgabe02 {
    public static void main(String[] args) {
        /*
         * Create a method that
         * takes three numbers and returns
         * greatest of them
         */
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(222);
        arrayList.add(78);
        System.out.println(max(arrayList));
    }
     static int max(ArrayList<Integer> arrayList1)
    {
        int maxNumber=0;
        for (int i=0;i<arrayList1.size();i++)
        {
            if(arrayList1.get(i)>maxNumber)
            {
                maxNumber= arrayList1.get(i);
            }
        }
        return maxNumber;
    }


}
