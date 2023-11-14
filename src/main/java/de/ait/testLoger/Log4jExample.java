package de.ait.testLoger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4jExample {

    private static final Logger logger = LoggerFactory.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        logger.info("This is an info message using Log4j!");
        logger.warn("This is a warning message.");
        logger.error("This is an error message.");
    }
}
