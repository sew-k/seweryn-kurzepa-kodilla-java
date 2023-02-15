package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {
    private static Logger logger = Logger.INSTANCE;

    @BeforeAll
    public static void saveFewLogs() {

        logger.log("First log");
        logger.log("Second log");
        logger.log("Third and LAST log");
    }

    @Test
    void testGetLastLog() {
        //Given

        //When & Then
        String result = logger.getLastLog();
        Assertions.assertEquals("Third and LAST log", result);
    }
}
