package de.ait.javaio;

import java.io.IOException;
import java.util.logging.Logger;

public class TestJavaIO {

    // path to the file of the interest
    private static final String PATH = "C:\\Users\\allex\\Desktop\\git\\aithomeworks\\password.txt";

    private static JavaReadWritePassFile javaReadWritePassFile;

    // Object Instance
    public static void main(String[] args) {

        //initialize
        javaReadWritePassFile = new JavaReadWritePassFile(PATH);

        try {
            //reading the file through a method call
            javaReadWritePassFile.readFile();

            javaReadWritePassFile.writeFile("Cohort !!!!");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
