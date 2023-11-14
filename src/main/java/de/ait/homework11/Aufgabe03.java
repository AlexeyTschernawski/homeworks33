package de.ait.homework11;

public class Aufgabe03 {
    public static void main(String[] args) {
        /**
         * Write a program
         * checking whether there are duplicates in the array.
         */
        int[] array = new int[]{20, 20, 40, 40, 40, 40, 55};
        int length = array.length;
        int result = 0;
        String strStatus = "Array has no duplicates";
        for (int i = 0; i <= length - 2; i++) {
            for (int j = i + 1; j <= length - 1; j++) {
                if (array[i] == array[j]) {
                    result = array[i];
                    strStatus = "Array has at least one duplicate!";
                    break;
                }
            }
        }
        System.out.printf("%s %d", strStatus, result);


        //#2
        int sizeArray = array.length;
        int different = sizeArray;
        int similar = 0;
        for (int i = 0; i < sizeArray; i++) {
            boolean foundDuplicate = false;
            for (int j = i + 1; j < sizeArray; j++) {
                if (array[i] == array[j]) {
                    foundDuplicate = true;
                    different--;
                    break;
                }
            }
            if (foundDuplicate) {
                similar++;
            }
        }
        System.out.println("Count of different elements: " + different);
        System.out.println("Count of similar elements: " + similar);
    }
}
