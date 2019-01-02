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
    public void checkAverage(){
        double result= test.getAvg(4,new int[] {86,65,77,98});
        assertEquals(81.50,result);
    }
    @Test
    public void checkMaximum(){
        double result= test.getMax(4,new int[] {86,65,77,98});
        assertEquals(98,result);
    }
    @Test
    public void checkMinimum(){
        double result= test.getMin(4, new int[] {86,65,77,98});
        assertEquals(65,result);
    }
}