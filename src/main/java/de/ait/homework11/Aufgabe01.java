package de.ait.homework11;

public class Aufgabe01 {
    public static void main(String[] args) {
        /*
         Write a program that counts
           the number of even and odd numbers in the array.
         */
        //1,5,7,8,3
         int [] array = new int[]{15, 21, 34, 40, 53, 55, 59, 60};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < array.length; i++) {//i=i+2
            int num = array[i];
            boolean check = num % 2 == 0;
            if (check == true) {
                evenCount++;
                System.out.println(evenCount);
            } else {
                oddCount++;
                System.out.println(evenCount);
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);

    }
}
