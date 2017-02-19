package eu.brugger.martin.loggingtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Level;

/**
 * Created by mbrugger on 17/02/2017.
 */
public class LoggerTest {

    public static void main(String[] args) {
        Logger slf4jLogger = LoggerFactory.getLogger(LoggerTest.class);
        slf4jLogger.info("some slf4j info message");
        slf4jLogger.error("some slf4j info message");
        slf4jLogger.debug("some slf4j info message");

        java.util.logging.Logger julLogger = java.util.logging.Logger.getLogger(LoggerTest.class.getName());
        julLogger.log(Level.FINEST, "some jul message");
        julLogger.log(Level.FINE, "some jul message");
        julLogger.log(Level.INFO, "some jul message");
        julLogger.log(Level.SEVERE, "some jul message");


    }
}
