package log;

import java.io.IOException;

import java.util.logging.FileHandler;

import java.util.logging.Logger;

import java.util.logging.SimpleFormatter;

public class LoggerInFile {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger("MyLog");

        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("logs.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        logger.addHandler(fileHandler);

        SimpleFormatter simpleFormatter = new SimpleFormatter();

        fileHandler.setFormatter(simpleFormatter);

        logger.info("Log test");

        logger.info("Hi In the main class test");

    }

}