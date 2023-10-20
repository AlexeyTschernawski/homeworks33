package de.ait.homework38_Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNamesApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> stringSet = new HashSet<>();

        while (true) {
            System.out.println("Geben Sie beliebegen Namen ein oder" + " stop " + "um den Vorgang abzuschließen: ");
            String nameList = scanner.nextLine();
            stringSet.add(nameList);
            if (nameList.equals("stop")) {
                break;
            }
            System.out.println(" ");
        }

            scanner.close();

            System.out.println(stringSet);
        }
    }

