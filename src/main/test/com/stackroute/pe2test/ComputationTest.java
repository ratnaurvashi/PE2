package com.stackroute.pe2test;

import com.stackroute.pe2main.Computation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputationTest {

    Computation test;
    @Before
    public void setUp() throws Exception {
    test = new Computation();
    }

    @Test
    public void checkAverageSuccess(){
        double result= test.getAvg(4,new double[] {86,65,77,98});
        assertEquals(81.50,result,0.01);
    }

    @Test
    public void checkAverageFailure(){
        double result= test.getAvg(4,new double[] {86,65,77,98});
        assertNotEquals(82,result,0.01);
    }

    @Test
    public void checkMaximumSuccess(){
        double result= test.getMax(4,new double[] {86,65,77,98});
        assertEquals(98,result,0.01);
    }

    @Test
    public void checkMaximumFailure(){
        double result= test.getMax(4,new double[] {86,65,77,98});
        assertNotEquals(65,result,0.01);
    }

    @Test
    public void checkMinimumSuccess(){
        double result= test.getMin(4, new double[] {86,65,77,98});
        assertEquals(65,result,0.01);
    }

    @Test
    public void checkMinimumFailure(){
        double result= test.getMin(4, new double[] {86,65,77,98});
        assertNotEquals(77,result,0.01);
    }
}