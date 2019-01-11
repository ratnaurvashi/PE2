package com.stackroute.pe2test;
import com.stackroute.pe2main.PowerOfFour;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PowerOfFourTest {

    PowerOfFour test;

    @Before
    public void setUp() throws Exception {
        test = new PowerOfFour();
    }

    @Test
    public void testIsPowerOfFour(){
        boolean result = test.checkPowerOfFour(64);
        assertEquals(true,result);
    }

    @Test
    public void testIsNotPowerOfFour(){
        boolean result = test.checkPowerOfFour(24);
        assertNotEquals(true,result);
    }
    @Test
    public void testIsZero(){
        boolean result = test.checkPowerOfFour(0);
        assertEquals(false,result);
    }
}