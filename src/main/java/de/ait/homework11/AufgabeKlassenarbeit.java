package de.ait.homework11;

public class AufgabeKlassenarbeit {
    public static void main(String[] args) {
        /*
        Напишите программу, которая находит сумму всех элементов
         в массиве целых чисел с использованием цикла `for-each`.
         */
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of all array elements: " + sum);

        /*
        Write a program that finds the largest element
          in an array and prints its value.
         */
        int[] array2 = {15, 7, 22, 13, 9};
        int maxElement = 0;
        for (int num : array2) {
            if (num > maxElement) {
                maxElement = num;
            }
        }
        System.out.println("Maximum element: " + maxElement);


        /*
        Write a program that counts the number
          elements in the array corresponding to a specific
          condition (for example, more than 10).
         */
        int[] array3 = {5, 15, 7, 22, 13, 9};
        int counter = 0;
        for (int num : array3) {
            if (num > 10) {
                counter++;
                System.out.print(num + " ");
            }
        }
        System.out.println("");
        System.out.println("Counter number bigger than ten: " + counter);

        /*
        Write a program
         which copies elements from one array to another.
         */
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] targetArray = new int[sourceArray.length];
        int index = 0;
        for (int number : sourceArray) {
            targetArray[index] = number;
            index++;
        }
        for (int number : targetArray) {
            System.out.print(number + " ");
        }
        System.out.println("");


        /*
        Write a program
         which counts the number of "a's" in a string.
         */
        String text = "Hallo Deutschland 97";//toCharArray
        int count = 0;
        char[] charArray = text.toCharArray();
        for (char letter: charArray) {
            if (letter == 'a' || letter == 'A') {
                count++;
            }
        }
        System.out.println("Number of 'a' letters in a line: " + count);

    }
}
