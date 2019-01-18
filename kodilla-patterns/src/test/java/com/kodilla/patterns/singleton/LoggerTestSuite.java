package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void createLog() {
        Logger.getInstance().log("exampleLog");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("exampleLog", lastLog);
    }
}
