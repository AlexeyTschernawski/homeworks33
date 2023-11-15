package de.ait.homework48;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class CurrencyConvertor {

    private static final Logger LOGGER = LoggerFactory.getLogger(CurrencyConvertor.class);

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the amount to convert:");
        String amount = scanner.nextLine();

        System.out.println("Enter source currency (USD, EUR):");
        String currency = scanner.nextLine();

        System.out.println("Enter target currency (USD, EUR)");
        String targetCurrency = scanner.nextLine();

        double result = convertCurrency(amount, targetCurrency, currency);
        System.out.println("Conversion result:"+ result);
        LOGGER.info("Convert result {}", result );

        scanner.close();

    }

    public static double convertCurrency(String amount, String targetCurrency, String currency) {
        boolean checkAmount = false;
        boolean checkTargetCurrency = false;
        boolean checkCurrency = false;
        double convertResult;
        double amountDouble = 0;
        String messageWrongCurrency = "Error: Non-existent currency code.";
        while (!checkAmount) {
            try {
                amountDouble = Double.parseDouble(amount);
                checkAmount = true;
                LOGGER.info("Amount to convert is {}", amountDouble);
            } catch (NumberFormatException | NullPointerException exception) {
                System.out.println("Error: The entered value is not a numeric value.");
                LOGGER.error("Wrong amount format: {}", amount, exception);
                System.out.println("Enter the amount to convert:");
                amount = scanner.nextLine();
            }
        }
        while (!checkTargetCurrency) {
            try {
                if (!targetCurrency.equals("USD") && !targetCurrency.equals("EUR")) {
                    throw new IllegalArgumentException("Wrong currency to convert");
                } else {
                    checkTargetCurrency = true;
                }
            } catch (IllegalArgumentException exception) {
                System.out.println(messageWrongCurrency);
                LOGGER.error("Wrong currency to convert {}", targetCurrency);
                System.out.println(messageWrongCurrency);
                System.out.println("Enter target currency (USD, EUR)");
                targetCurrency = scanner.nextLine();
            }

            while (!checkCurrency) {
                try {
                    if (!currency.equals("USD") && !currency.equals("EUR")) {
                        throw new IllegalArgumentException("Wrong currency");
                    } else {
                        checkCurrency = true;
                    }
                } catch (IllegalArgumentException exception) {
                    System.out.println(messageWrongCurrency);
                    LOGGER.error("Wrong currency to convert {}", targetCurrency);
                    System.out.println(messageWrongCurrency);
                    System.out.println("Enter source currency (USD, EUR):");
                    currency = scanner.nextLine();
                }
            }
        }

        if(currency.equals(targetCurrency)){
            return amountDouble;
        }

        if(currency.equals("USD")){
            convertResult = amountDouble * 0.85;
        }
        //EUR
        else {
            convertResult = amountDouble * 1.2;
        }
        return convertResult;
    }
}
