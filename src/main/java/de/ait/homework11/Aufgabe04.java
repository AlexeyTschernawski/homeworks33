package de.ait.homework11;

public class Aufgabe04 {
    public static void main(String[] args) {
        /*
         * Given an array containing three different numbers,
         * representing three different colors.
         * Sort it like this
         * so that the same colors appear in a row.
         */
        int[] colors = {2,2,4,1,1,3}; // Example of an array with three different colors
        //1,1,2,2,3,4
        int size = colors.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (colors[j] > colors[j + 1]) {
                    int temp = colors[j];
                    colors[j] = colors[j + 1];
                    colors[j + 1] = temp;
                }
            }
        }

        for(int i=0; i < colors.length; i++ ) {
            System.out.print(colors[i] + " ");
        }
    }

}
