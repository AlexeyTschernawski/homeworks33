package de.ait.homework12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe01 {
    public static void main(String[] args) {
        /*
        Given an array of integers.
         Using a for-each loop and learned structures
          data, determine the number that
           occurs most often in the array.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me how long should be the array?");
        int arrayLength = scanner.nextInt();
        int[] myArrayOne = new int[arrayLength];
        System.out.println("Enter " + arrayLength + " numbers");
        for (int i = 0; i < arrayLength; i++) {
            myArrayOne[i] = scanner.nextInt();
        }
        int mostFrequent = myArrayOne[0];// the most frequent number
        int maxFrequency = 1; // max frequency
        int frequency = 1; // current frequency
        int currentIndex = 0;
        for (int num : myArrayOne) {  // for each is here
            if (currentIndex > 0 && num == myArrayOne[currentIndex - 1]) {
                frequency++;
            } else {
                frequency = 1;
            }
            if (frequency > maxFrequency) {
                mostFrequent = num;
                maxFrequency = frequency;
            } else if (frequency == maxFrequency) {
                mostFrequent = Math.min(mostFrequent, num);
            }
            currentIndex++;
        }
        System.out.println("number " + mostFrequent + " occurs most often in the array: . ");
        System.out.print("array: ");
        for (int i = 0; i < myArrayOne.length; i++)
            System.out.print(" " + myArrayOne[i]);


        //#2
        int[] array = new int[]{1, 2, 8, 4, 2, 6, 8, 3, 4, 5, 8, 6, 7, 8, 9, 9, 9, 9};
        ArrayList<Integer> listInt = new ArrayList<>();
        Arrays.sort(array);//sort array
        System.out.println(array.length);
        int count = 0;
        for (int num : array)//print out array
        {
            System.out.printf("%d ", num);
        }
        int maxchislo = 0;//determine the maximum number from an array of given numbers
        for (int num : array) {
            if (num > maxchislo) {
                maxchislo = num;
            }
        }
        int minchislo = 999;//determine the minimum number from an array of given numbers
        for (int l : array) {
            if (l <= minchislo) {
                minchislo = l;
            }
        }
        System.out.println("\n");
        System.out.println(maxchislo + " " + minchislo);//display the minimum and maximum numbers of the array
        for (int i = minchislo; i <= maxchislo; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++)//We count the number of repetitions of each number
            {
                if (i == array[j]) {
                    count++;
                }
            }
            listInt.add(i);//Add occurring numbers to the array
            listInt.add(count);//Add the number of turns of each number to another array
        }
        System.out.println(listInt);
        int[] arr2 = new int[listInt.size()];
        for (int j = 0; j < listInt.size(); j++) {
            arr2[j] = listInt.get(j);
        }
        int max = 0;
        int ind = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (i % 2 != 0) {
                if (arr2[i] >= max) {
                    max = arr2[i];
                    ind = i;
                }
            }
        }
        System.out.println("Maximum number of repetitions:" + max + " times" + "of number  " + arr2[ind - 1]);
    }
}



