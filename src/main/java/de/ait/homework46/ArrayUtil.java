package de.ait.homework46;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ArrayUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArrayUtil.class);


    private static String[] arrayCar = {"Audi", "BMW", "VW", "MB", "Seat"};

    public static void main(String[] args) {

        boolean resultExact = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the item to retrieve: ");
        while (!resultExact) {
            try {
                String input = scanner.nextLine();
                int element = Integer.parseInt(input);
                String elementValue = arrayCar[element];
                LOGGER.info("Retrieved element: {}", elementValue);
                resultExact = true;
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException exception) {
                LOGGER.error("Error.", exception);
            } catch (Exception exception) {
                LOGGER.error("Unknown error", exception);
            } finally {
                LOGGER.info("Search operation completed.");
            }
        }
        scanner.close();
    }

}