package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void calculateFinalMark() {
        assertEquals(68.4, Main.calculateFinalMark(76, 88, 65), 0);
    }

    @Test
    public void outputStudent() {
        assertEquals("Jones Bob -- 69: 54.0", Main.outputStudent("Jones", "Bob", 69, 54));
    }

}