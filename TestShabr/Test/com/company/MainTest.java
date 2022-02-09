package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void getCm() {
        Float a = new Float("25.4");
        Float b = Main.getCm((float) 10);
        assertEquals(a,b);
    }

    @Test
    public void getInch() {
        Float a = new Float("10");
        Float b = Main.getInch((float) 25.4);
        assertEquals(a,b);
    }
}
