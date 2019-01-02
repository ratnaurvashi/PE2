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
    public void TestFact() {
        long result = test.fact(5);
        assertEquals(120,result);
    }
}