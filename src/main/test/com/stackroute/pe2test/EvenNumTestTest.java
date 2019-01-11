package com.stackroute.pe2test;

import com.stackroute.pe2main.EvenNumTest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest test;

    @Before
    public void setUp() throws Exception {
        test=  new EvenNumTest();
    }
    @Test
    public void testIsEven(){
        boolean result = test.checkEven(66);
        assertTrue(result);
    }
    @Test
    public void testIsNotEven(){
        boolean ans = test.checkEven(83);
        assertNotEquals(true,ans);
    }
    @Test
    public void testIsZero(){
        boolean ans = test.checkEven(0);
        assertEquals(false,ans);
    }
}