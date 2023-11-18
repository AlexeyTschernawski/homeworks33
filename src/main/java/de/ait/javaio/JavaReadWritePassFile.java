package de.ait.javaio;


import de.ait.homework44.LibraryCatalog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class JavaReadWritePassFile {

    private static final Logger LOGGER = LoggerFactory.getLogger(LibraryCatalog.class);

    //for read file
    private InputStream inputStream;

    //for making changes to the file
    private OutputStream outputStream;

    //the path to the file of interest
    private String path;

    public JavaReadWritePassFile(String path) {
        this.path = path;
    }


    // reading the file
    public void readFile() throws IOException {
        //initialize reading the stream
        inputStream = new FileInputStream(path);

        //reading firs symbol
        int data = inputStream.read();

        char content;

        //reading the contents of the file (bytes)
        while (data != -1) {

            //byte--> symbol
            content = (char) data;

            //output the resulting symbol
            System.out.print(content);
            data = inputStream.read();

        }
        LOGGER.info("Alarm!!!!");
        //closing the stream
        inputStream.close();
    }

        //write the file
        public void writeFile(String stringToWrite) throws IOException {
        //initialize the stream for writing
        outputStream = new FileOutputStream(path);

        // preparation to make an entry to the file
        outputStream.write(stringToWrite.getBytes());

        // closing the stream
        outputStream.close();

        }
    }

