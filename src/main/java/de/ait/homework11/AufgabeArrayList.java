package de.ait.homework11;

import java.util.ArrayList;

public class AufgabeArrayList {
    public static void main(String[] args) {

        //ArrayList<Тип> name = new ArrayList<Тип>();
        ArrayList<Integer> listInt = new ArrayList<>();
        Integer elementOne = 10;
        Integer elementTwo = 20;
        ArrayList<String> listString = new ArrayList<>();
        ArrayList<Double> listDouble = new ArrayList<>();

        listInt.add(elementOne);
        listInt.add(elementTwo);
        listInt.add(0, 5);
        listInt.set(2, 5); //20-->5
        //listInt.clear();

        int sizelistInt = listInt.size();


        Integer resultGet = listInt.indexOf(10);

        //listInt.remove(2);

        for (int i = 0; i < listInt.size(); i++) {
            System.out.print(" " + listInt.get(i));
            if (listInt.get(i) == 30) {
                listInt.remove(i);
            }
        }

        System.out.println("");

        for (Integer element : listInt) {
            System.out.print(" " + element);
            if (element > 10) {
                listInt.remove(element);
            }
        }

        System.out.println("");
        System.out.println(listInt);

        listInt.remove(1);
        System.out.println("");


        //#3
        int[] array = new int[]{5, 2, 6, 8, 5, 6, 5, 5, 3};
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0,
                count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0;
        int i = 0;
        for (int number : array) {
            if (array[i] == 1) {
                count1++;
            }
            if (array[i] == 2) {
                count2++;
            }
            if (array[i] == 3) {
                count3++;
            }
            if (array[i] == 4) {
                count4++;
            }
            if (array[i] == 5) {
                count5++;
            }
            if (array[i] == 6) {
                count6++;
            }
            if (array[i] == 7) {
                count7++;
            }
            if (array[i] == 8) {
                count8++;
            }
            if (array[i] == 9) {
                count9++;
            }
            i++;
        }
        System.out.println("1-" + count1);
        System.out.println("2-" + count2);
        System.out.println("3-" + count3);
        System.out.println("4-" + count4);
        System.out.println("5-" + count5);
        System.out.println("6-" + count6);
        System.out.println("7-" + count7);
        System.out.println("8-" + count8);


    }
}
