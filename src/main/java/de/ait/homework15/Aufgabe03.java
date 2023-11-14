package de.ait.homework15;

import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabe03 {
    public static void main(String[] args) {
        /*
        Create a method that takes
        a list of numbers and returns a list
        only even numbers from it.
         */
        ArrayList<Integer> arrayList = createList();
        ArrayList<Integer> sortResult = chetnye(arrayList);
        System.out.println(sortResult);

        System.out.println(filterEvenNumbers(arrayList));


        //#3
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int input;
        do {
            System.out.println("Введите число или 0 для выхода");
            input = scanner.nextInt();
            if (input != 0) list.add(input);

        } while (input != 0);
        ArrayList<Integer> newList = devidedByTwo(list);
        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i) + " ");
        }

    }

    static ArrayList<Integer> chetnye(ArrayList<Integer> arraylist)
    {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for(int i=0; i<arraylist.size();i++)
        {
            if(arraylist.get(i)%2==0)
            {
                integerArrayList.add(arraylist.get(i));
            }
        }
        return integerArrayList;
    }

    static ArrayList<Integer> createList(){
        ArrayList<Integer> listInt1 = new ArrayList<>();
        listInt1.add(1);
        listInt1.add(2);
        listInt1.add(1);
        listInt1.add(0);
        listInt1.add(222);
        listInt1.add(10);
        listInt1.add(23);
        listInt1.add(12);
        listInt1.add(90);
        listInt1.add(222);

        System.out.println(listInt1);

        return listInt1;
    }

    static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }

    private static ArrayList<Integer> devidedByTwo(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) newList.add(list.get(i));
        }
        return newList;
    }

}
