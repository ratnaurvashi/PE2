package com.stackroute.pe2test;

import com.stackroute.pe2main.LongFactorial;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;

public class LongFactorialTest{

    LongFactorial test;

    @Before
    public void setUp() throws Exception {
        test = new LongFactorial();
    }

    @Test
    public void TestFactSuccess() {
        int result = test.fact(5);
        assertEquals(120,result);
    }

    @Test
    public void TestFactFailure() {
        int result = test.fact(2);
        assertNotEquals(120,result);
    }
}