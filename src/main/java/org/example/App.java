package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        IntStream.range(0,10000).forEach(value ->{
            logger.debug("Hello from Logback");

            logger.debug("getNumber() : {}", getNumber());

        } );



    }

    static int getNumber() {
        return 5;
    }
}
