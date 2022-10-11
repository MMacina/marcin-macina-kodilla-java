package com.kodilla.patterns.singleton;

import com.kodilla.patterns.Logger;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

     @Test
    void getLastLogTest() {
        //Given
        String log = "Some log";
        Logger logger = Logger.INSTANCE;

        //When
        logger.log(log);

        //Then
        String result = logger.getLastLog();
     }
}
