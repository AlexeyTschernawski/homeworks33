package de.ait.homework11;

public class Aufgabe02 {
    public static void main(String[] args) {
        /*
         * Write a program
         * combining two arrays into one array.
         */
        int[] array1 = new int[]{20, 30, 40, 50, 60};
        int[] array2 = new int[]{32, 55, 66, 77, 99, 100};
        int[] array3 = new int[array1.length + array2.length];
        int lengthnewArray = array3.length;
        System.out.println("New array length: " + lengthnewArray);
        // Fill in the first part
        for (int i = 0; i <= array1.length - 1; i++) {
            array3[i] = array1[i];
        }
        // fill second part
        int j = 0;
        for (int i = array1.length; i < array3.length ; i++) {
            array3[i] = array2[j];
            j++;
        }
        System.out.println("Outputing the merged array3...");
        for (int i = 0; i <= array3.length - 1; i++) {
            System.out.print(array3[i] + " ");
        }

        System.out.println("");

        //#2
        int[] first = new int[]{1, 2, 3};
        int[] second = new int[]{4, 5};
        int[] concatenatedArray = new int[first.length + second.length];
        for (int i = 0; i < first.length; i++) {
            concatenatedArray[i] = first[i];
        }
        for (int i = 0; i < second.length; i++) {
            concatenatedArray[first.length + i] = second[i];
        }
        System.out.print("Concatenated array: ");
        for (int num : concatenatedArray) {
            System.out.print(num + " ");
        }

    }
}
