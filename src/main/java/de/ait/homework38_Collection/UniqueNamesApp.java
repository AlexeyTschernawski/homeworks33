package de.ait.homework38_Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNamesApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> stringSet = new HashSet<>();
        System.out.println("Geben Sie beliebegen Namen ein oder" + " stop " + "um den Vorgang abzuschließen: ");

            while (true) {

            String nameList = scanner.nextLine();

            if (nameList.equals("stop")) {
                break;
            }
            stringSet.add(nameList);
            System.out.println("wurde eingefügt ");
        }

            scanner.close();

            System.out.println(stringSet);
        }
    }

