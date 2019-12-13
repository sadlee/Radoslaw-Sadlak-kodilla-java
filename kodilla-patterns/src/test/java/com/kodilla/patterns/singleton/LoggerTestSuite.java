package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void quantityLog() {
        Logger.getInstance().log("aaaaa");
        Logger.getInstance().log("bbbbb");
        Logger.getInstance().log("ccccc");
    }

    @Test
    public void getLastLog() {
        //Give

        //When
        String lastLog = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("ccccc",lastLog);
    }
}