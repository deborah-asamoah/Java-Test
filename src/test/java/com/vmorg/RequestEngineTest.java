package com.vmorg;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RequestEngineTest {

    RequestEngine requestEngine;



    @Test
    void generateHostName() {

        requestEngine = new RequestEngine();
       String a = requestEngine.generateHostName("A", "202304005", 5 );

       assertEquals(a, "A202304005");





    }

    @Test
    void authenticateUser() {
        requestEngine = new RequestEngine();
        assertEquals(requestEngine.authenticateUser("Debbie"), "Debbie");
    }
}