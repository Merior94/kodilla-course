package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void openSettingsFile() {
        logger = Logger.INSTANCE;
        logger.log("Test log");
    }

    @Test
    void testGetLastLog() {
        //Given
        //When
        String lastLog = logger.getLastLog();

        System.out.println("Last log " + lastLog);
    }

}
