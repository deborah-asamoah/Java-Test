package com.vmorg.vm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MachineTest {

    Machine machine;

    @BeforeEach
    void setUp (){
        machine = new Machine();

    }

    @Test
    void setHostName() {
        String host = "host";
        String date = "202304005";
        int build = 5;
        machine = new Machine(host, date);



        assertEquals(machine.getHostName(), "host20230328");



    }
}